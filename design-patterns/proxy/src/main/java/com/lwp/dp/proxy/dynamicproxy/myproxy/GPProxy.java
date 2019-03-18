package com.lwp.dp.proxy.dynamicproxy.myproxy;

import com.lwp.dp.proxy.Person;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author lanwp
 * @Date 2019/3/14
 */
public class GPProxy {

    public static final String LINE = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h) {
        // 1.生成java源代码
        String sourceCode = generateSource(interfaces);

        // 2. 输出内容到磁盘
        File file = null;
        FileWriter fw = null;
        try {
            String filePath = GPProxy.class.getResource("").getPath();
            file = new File(filePath + "$Proxy0.java");
            fw = new FileWriter(file);
            fw.write(sourceCode);
            // ********** 需要刷新,否则class文件可能读取不到 ***********
            fw.flush();

            //3、把生成的.java文件编译成.class文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = standardFileManager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, standardFileManager, null, null, null, iterable);
            task.call();
            standardFileManager.close();

            //4、编译生成的.class文件加载到JVM中来
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            file.delete();

            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //5、返回字节码重组以后的新的代理对象
        return null;
    }


    private static String generateSource(Class<?>[] interfaces) {

        Objects.requireNonNull(interfaces);

        if (interfaces.length == 0) {
            throw new IllegalArgumentException("interfaces length is 0");
        }

        StringBuilder sb = new StringBuilder(128);

        String packageName = "com.lwp.dp.proxy.dynamicproxy.myproxy";
        sb.append("package ").append(packageName).append(";").append(LINE);
        for (int i = 0; i < interfaces.length; i++) {
//            sbInterfaces.append(interfaces[i].getName());
            sb.append("import ").append(interfaces[i].getName()).append(";").append(LINE);
        }
        sb.append("import java.lang.reflect.*; ").append(LINE);

//        String className = "$Proxy0";
        StringBuilder sbInterfaces = new StringBuilder();
        for (int i = 0; i < interfaces.length; i++) {
            if (i > 0) {
                sbInterfaces.append(",");
            }
            sbInterfaces.append(interfaces[i].getName());
        }
        String interfacesName = sbInterfaces.toString();
        sb.append("public class $Proxy0 implements ").append(interfacesName).append("{").append(LINE);

        // 类中的内容
        sb.append("GPInvocationHandler h;" + LINE);
        sb.append("public $Proxy0(GPInvocationHandler h) { " + LINE);
        sb.append("this.h = h;");
        sb.append("}" + LINE);
        for (Method m : interfaces[0].getMethods()){
            Class<?>[] params = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " +  paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if(i > 0 && i < params.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + LINE);
            sb.append("try{" + LINE);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + LINE);
            sb.append((hasReturn(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + LINE);
            sb.append("}catch(Error _ex) { }");
            sb.append("catch(Throwable e){" + LINE);
            sb.append("  throw new UndeclaredThrowableException(e);" + LINE);
            sb.append("}");
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}");
        }
        sb.append(LINE);

        sb.append("}").append(LINE);
        return sb.toString();
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == Void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturn(Class<?> clazz){
        return clazz != Void.class;
    }


    public static void main(String[] args) {
        System.out.println(generateSource(new Class[]{Person.class}));
//        writeDisk("123");
    }
}
