package com.itheima_05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> lit = new ArrayList<String>();
        lit.add("hello");
        lit.add("world");
        lit.add("java");

        //ListIterator 遍历
        ListIterator<String> l = lit.listIterator();
       /* while (l.hasNext()) {
            String s = l.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //反向遍历
        ListIterator<String> l1 = lit.listIterator();
        while (l1.hasPrevious()) {
            String s = l1.previous();
            System.out.println(s);
        }*/

         while(l.hasNext()){
             String s = l.next();
             if(s.equals("world")){
                 l.add("javaee");
             }
         }
        System.out.println(lit);


    }
}
