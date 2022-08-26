package com.itheima_05;

/*
哈希值 测试类
 */
public class HashDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);
        Student s4 = new Student("林青霞", 30);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("--------");


        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());
        System.out.println("--------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("--------");

    }


}
