package com.itheima_03;


import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar c3=Calendar.getInstance();
        Calendar s4=Calendar.getInstance();
        Calendar c5=Calendar.getInstance();
        Calendar c6=Calendar.getInstance();

        c.add(Calendar.YEAR,+5);
        int year=c.get(Calendar.YEAR);

        c.add(Calendar.MONTH,+5);
        int month=c.get(Calendar.MONTH)+1;

        c.add(Calendar.DATE,+5);
        int date=c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");




        System.out.println("--------");

        c.set(2022,07,12);
        int year1=c.get(Calendar.YEAR);
        int month1=c.get(Calendar.MONTH);
        int date1=c.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+date1+"日");









    }
}
