package com.itheima_03;


import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建对象
        Date d=new Date();

        //调用方法
        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String s1="2022-06-12";
        Date dd = DateUtils.stringToDate(s1, "yyyy-MM-dd");
        System.out.println(dd);

    }
}
