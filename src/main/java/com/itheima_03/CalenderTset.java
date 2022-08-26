package com.itheima_03;


//用程序实现 输入一个年份，得到此年份的2月份有多少天

import java.util.Calendar;
import java.util.Scanner;

public class CalenderTset {
    public static void main(String[] args) {
        //键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        //创建日历对象
        Calendar c = Calendar.getInstance();

        //设置时间为3月1号

        c.set(year, 2, 1);

        //把时间改为前一天
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
        System.out.println("--------");


        c.set(2022,06,13);
        int year1=c.get(Calendar.YEAR);
        int month1=c.get(Calendar.MONTH);
        int date1=c.get(Calendar.DATE);


    }
}
