package com.itheima_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");

        //迭代器遍历
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //增强for遍历
        for(String s:set){
            System.out.println(s);
        }

    }
}
