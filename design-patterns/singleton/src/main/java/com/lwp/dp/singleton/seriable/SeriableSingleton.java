package com.lwp.dp.singleton.seriable;

import java.io.Serializable;

/**
 * @Author lanwp
 * @Date 2019/3/11 0:43
 * //反序列化时导致单例破坏
 */
public class SeriableSingleton implements Serializable {

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new
    private static final SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {

    }

    public static final SeriableSingleton getInstance() {
        return INSTANCE;
    }

    // 声明此方法readResolve并返回，即可保证单例
    private  Object readResolve(){
        return  INSTANCE;
    }
}
