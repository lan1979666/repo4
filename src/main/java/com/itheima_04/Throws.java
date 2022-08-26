package com.itheima_04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws {
    public static void main(String[] args) {
        System.out.println("开始");

        method();

//        try {
//            method2();
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
       System.out.println("结束");


        //throwable
        /*int[] arr={1,2,3};
        System.out.println(arr[3]);*/


    }

    //编译时异常
//    public static void method2() throws ParseException {
//        String s = "2022-06-09";
//        SimpleDateFormat sdj = new SimpleDateFormat("yyyy-MM-dd");
//        Date d = sdj.parse(s);
//        System.out.println(d);
//    }

    //运行时异常
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }


}





