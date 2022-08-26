package com.itheima_06;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        System.out.println(s1.getName()+","+s1.getAge());
        System.out.println(s1.toString());
        System.out.println("--------");

        Student s2=new Student();
        s2.setName("张曼玉");
        s2.setAge(33);
        System.out.println(s2.getName()+","+s2.getAge());
        System.out.println(s2.toString());
        System.out.println("--------");

        System.out.println(s1.equals(s2));
    }
}
