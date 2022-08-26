package com.itheima_05;

import java.util.HashSet;
import java.util.Iterator;

/*
HashSet 测试类
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Student02> hs=new HashSet<Student02>();

        Student02 s1=new Student02("林青霞",30);
        Student02 s2=new Student02("张曼玉",35);
        Student02 s3=new Student02("王祖贤",33);
        Student02 s4=new Student02("王祖贤",33);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //迭代器遍历
        Iterator<Student02> it=hs.iterator();
        while(it.hasNext()){
            Student02 s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");

        //增强for遍历
        for(Student02 s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }




    }
}
