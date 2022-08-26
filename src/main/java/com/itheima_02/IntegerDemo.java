package com.itheima_02;

public class IntegerDemo {
    public static void main(String[] args) {
        //自动装箱
        Integer i = Integer.valueOf(100);
        Integer ii=100;

        //自动拆箱
        ii+=200; //+= 是加后赋值的意思， 隐含自动拆箱
        ii=300;
        ii=ii.intValue()+200; //手动拆箱

        Integer iii=null;
        iii+=300;
        System.out.println(iii);


        //基本类型包装类，int和String的互相转换, Integer.valueOf();/  Integer.parseInt();
        int num = 100;
        String s = "" + 100;
        System.out.println(s);

        String s2 = String.valueOf(num);
        System.out.println(s2);

        String s3 = String.valueOf(num);
        String s4 = String.valueOf(num);
        String s5 = String.valueOf(num);

        String s1 = "200";
        int i8 = Integer.parseInt(s1);
        System.out.println(i8);

        int y = Integer.parseInt(s1);
        System.out.println(y);

        int number = 500;
        String str = String.valueOf(number);
        System.out.println(str);

        String str1 = "600";
        int z = Integer.parseInt(str1);
        System.out.println(z);

        int y1 = Integer.parseInt(str1);
        System.out.println(y1);

        int o = 700;
        String q = String.valueOf(o);

        String w = "800";
        int e = Integer.parseInt(w);
        System.out.println(e);


        int t = 100;
        String s6 = String.valueOf(t);

        String s7 = "100";
        int y2 = Integer.parseInt(s7);
        System.out.println(y2);


        String s8 = "200";
        int y3 = Integer.parseInt(s8);


    }
}
