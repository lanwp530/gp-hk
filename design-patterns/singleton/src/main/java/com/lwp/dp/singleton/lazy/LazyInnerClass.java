package com.lwp.dp.singleton.lazy;

/**
 * @Author lanwp
 * @Date 2019/3/10 17:39
 *
 * //懒汉式单例
 *
 *
 * //这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * //完美地屏蔽了这两个缺点
 */
public class LazyInnerClass {

    private LazyInnerClass() {

    }

    /**
     * 外部没有使用带则不会被classloader加载，实现了懒加载
     */
    public static class InnerClass {
        private static final LazyInnerClass INSTANCE = new LazyInnerClass();
        static {
            System.out.println("InnerClass load...");
        }
    }
    public static final LazyInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    public static void test() {
        System.out.println("test mothed...");
    }
}
