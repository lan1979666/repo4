package com.itheima_05;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList =new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        linkedList.addFirst("javass");
        linkedList.addLast("javaee");

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.get(0));

        System.out.println(linkedList);
    }
}
