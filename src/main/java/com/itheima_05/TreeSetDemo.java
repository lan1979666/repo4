package com.itheima_05;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tr=new TreeSet<String>();

        tr.add("hello");



        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(10);
        t.add(40);
        t.add(50);
        t.add(20);
        t.add(30);
        t.add(30);

        for(Integer i:t){
            System.out.println(i);
        }

        Iterator<Integer> i=t.iterator();
        while(i.hasNext()){
            Integer a = i.next();
            System.out.println(a);
        }
    }
}
