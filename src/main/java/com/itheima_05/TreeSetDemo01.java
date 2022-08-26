package com.itheima_05;
/*
TreeSet 测试类
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student01> t = new TreeSet<Student01>();

        Student01 s1 = new Student01("linqignxia", 30);
        Student01 s2 = new Student01("zhangmanyu", 35);
        Student01 s3 = new Student01("wangzuxian", 33);

        Student01 s4 = new Student01("linqingxia", 30);

        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);

        //迭代器遍历
       /* Iterator<Student01> it = t.iterator();
        while (it.hasNext()) {
            Student01 s = it.next();
            System.out.println(s.getName() + ", " + s.getAge());
        }*/

        //增强for循环

        for (Student01 s : t) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
