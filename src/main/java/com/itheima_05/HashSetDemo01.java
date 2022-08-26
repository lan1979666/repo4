package com.itheima_05;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        //迭代器遍历
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //增强for遍历

        for(String s:hs){
            System.out.println(s);
        }
    }
}
