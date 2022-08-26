package com.package01;

public class PackageTest01 {

    public static String name;
    public final int age = 12;
    public static final String t = "123";


    {
        name = "etf";
    }

    static {
        name = "abc";
        System.out.println("static："+name);
    }


    public void test() {
        staticTest();
    }

    public static void staticTest() {
        System.out.println(name);
    }

}
