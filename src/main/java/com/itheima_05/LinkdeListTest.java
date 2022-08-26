package com.itheima_05;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkdeListTest {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        //迭代器遍历
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //for循环遍历
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        //增强for循环
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("--------");

        //创建对象
        LinkedList<String> LinkedList = new LinkedList<String>();
        LinkedList.add("hello");
        LinkedList.add("world");
        LinkedList.add("java");

        //遍历，3种方式
        //迭代器遍历
        Iterator<String> it1 = LinkedList.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            System.out.println(s);
        }

        //System.out.println("--------");
        //for循环遍历
        for (int i = 0; i < LinkedList.size(); i++) {
            String s = LinkedList.get(i);
            System.out.println(s);
        }


        System.out.println("--------");
       //增强for遍历
        for (String s : LinkedList) {
            System.out.println(s);

        }

    }
}
