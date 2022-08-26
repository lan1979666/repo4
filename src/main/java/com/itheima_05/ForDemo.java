package com.itheima_05;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        //数组
        int[] arr={1,2,3,4};
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("--------");

        //字符串
        String[] strArray={"hello","world","java"};
        for(String s:strArray){
            System.out.println(s);
        }
        System.out.println("--------");

        //集合
        List<String> l=new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("java");

        for(String s:l){
            System.out.println(s);
        }

    }
}
