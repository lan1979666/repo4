package com.itheima_05;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("hello");
        linkedHashSet.add("world");

        //迭代器遍历
        Iterator<String> it=linkedHashSet.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //增强for遍历
        for(String s:linkedHashSet){
            System.out.println(s);
        }


    }
}
