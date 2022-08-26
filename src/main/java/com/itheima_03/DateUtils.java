package com.itheima_03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //构造私有无参方法
    private DateUtils(){}


    // 定义一个方法，从Date 到String 把日期转为指定格式的字符串
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdj=new SimpleDateFormat(format);
        String s=sdj.format(date);
        return s;
    }

    //定义一个方法，从String 到Date 把字符串解析为指定格式的日期
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sjd =new SimpleDateFormat(format);
        Date d=sjd.parse(s);
        return d;
    }

}


