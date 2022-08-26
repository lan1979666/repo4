package com.itheima_02;


import java.util.Date;

public class DateDemo {
    public static void main(String[] args)  {
        Date d=new Date();
        System.out.println(d);//输出当前时间
        System.out.println(d.getTime());//输出1970年至今的毫秒值
        System.out.println(d.getTime()/1000/60/60/24/365);//输出1970年至今的 年数 值
        System.out.println(System.currentTimeMillis());//输出的1970年至今的毫秒值

        //long time=System.currentTimeMillis();
        System.out.println("-------");
        long time1=1000*60*60;
        d.setTime(time1);
        System.out.println(d);





    }

}
