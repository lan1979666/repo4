package com.exceptiontest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse("2012/06-08 12:20:20");
            System.out.println(parse);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    /**
     * error
     * exception
     *
     */

}
