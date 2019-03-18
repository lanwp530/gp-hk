package com.lwp.dp.proxy.dbroute.db;

/**
 * @Author lanwp
 * @Date 2019/3/16
 */
public class DynamicDataSourceEntity {

    public static final String DEFAULT_SOURCE = null;
    public static ThreadLocal<String> local = new ThreadLocal();

    private DynamicDataSourceEntity() {

    }

    public static String get() {return local.get();}

    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }
}
