package com.itheima_03;
/*
自动装箱和拆箱
*/
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(100);//手动装箱
        System.out.println(i);
        Integer ii=100;//自动装箱
        System.out.println(ii);

        Integer i1=Integer.valueOf(100);
        System.out.println(i1);
        Integer i2=100;
        Integer i3=Integer.valueOf(1000);
        System.out.println(i3);


        ii+=200;//自动拆箱
        System.out.println(ii);
        ii=i.intValue()+200;//手动拆箱
        System.out.println(ii);

        ii+=100;
        System.out.println(ii);
        ii+=i.intValue()+100;
        System.out.println(ii);
        Integer iii=null;
        if(iii!=null){
            iii+=300;
        }



    }


}
