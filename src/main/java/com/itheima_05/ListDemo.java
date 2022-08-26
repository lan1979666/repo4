package com.itheima_05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("100");
        list.add("200");
        list.add("300");

        list.add(1,"java");
        //System.out.println(list.get(1));
        //System.out.println(list.remove("java"));
        //System.out.println(list.set(1,"hello"));
        System.out.println(list);

        //System.out.println(list.remove("100"));

        //list.clear();

        //遍历
        //迭代器遍历
        /*Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //普通for 循环遍历
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

        //增强for循环
        for(String s:list){
            System.out.println(s);
        }*/
    }
}
