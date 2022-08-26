package com.itheima_05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo_Bfxgyc {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //迭代器遍历，在world处增加 javaee元素
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            if(s.equals("world")){
//                list.add("javaee");
//            }
//        }

        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);

    }


}
