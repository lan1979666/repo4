package com.itheima_02;


import java.util.Arrays;


public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";
        //拆分数组
        String[] split = s.split(" ");

        //定义一个数组 从String 类型转为int类型 //int y=Integer.parseInt(s);  s 代表前面的数组,   Integer.parseInt();解析前面的String数组，数组是前面的数组
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }


        //冒泡排序
        Arrays.sort(arr);

        //重组数组
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);

        System.out.println("-------");

        //String 类型转换为 StringBuilder
        String z = "hello";
        StringBuilder q = new StringBuilder(z);
        System.out.println(q);
        System.out.println("-------");

        //StringBuilder类型转换为String
        StringBuilder w = new StringBuilder();
        w.append("world");
        String e = w.toString();
        System.out.println(e);
        System.out.println("-------");

        String r = "java";
        StringBuilder t = new StringBuilder(r);
        System.out.println(t);
        System.out.println("-------");

        StringBuilder y = new StringBuilder();
        y.append("java");
        String u = y.toString();
        System.out.println(u);
        System.out.println("-------");

        String s1 = "javaee";
        StringBuilder q1 = new StringBuilder(s1);
        System.out.println(q1);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("javase");
        String s2 = sb1.toString();
        System.out.println(s2);


        int numbmer = 100;
        String s3 = String.valueOf("number");
        int num = 200;
        String s4 = String.valueOf(num);

        String s5 = "100";
        int y5 = Integer.parseInt(s5);
        int y6 = Integer.parseInt(s5);


        String s7="100";
        StringBuilder sb2=new StringBuilder(s7);

        StringBuilder sb3=new StringBuilder();
        sb3.append("100");

        String result2 = sb3.toString();
        System.out.println(result2);


    }
}
