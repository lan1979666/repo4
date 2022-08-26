package com.itheima_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();

        //从Date到String
        SimpleDateFormat sdj=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat sdj1=new SimpleDateFormat();
        String s = sdj.format(d);
        //String s1 = sdj1.format(d);
        System.out.println(s);
        //System.out.println(s1);

        SimpleDateFormat sdj1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1=sdj1.format(d);
        System.out.println(s1);






        //从String 到 Date
        String s3 ="2022-06-09";
        SimpleDateFormat sdj3=new SimpleDateFormat("yyyy-MM-dd");
        Date dd = sdj3.parse(s3);
        System.out.println(dd);


        String s4="2022-06-12 20:20:20";
        SimpleDateFormat sdj4=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date4=sdj4.parse(s4);
        System.out.println(date4);
    }
}
