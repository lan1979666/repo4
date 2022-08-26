package com.YunDongYuan_01;

/*
测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建乒乓球运动员对象，调用方法
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.speak();
        ppp.study();
        ppp.eat();
        System.out.println("--------");
        PingPangPlayer pp = new PingPangPlayer("王浩", 30);
        System.out.println(ppp.getName() + ", " + pp.getAge());
        pp.eat();
        pp.study();
        pp.speak();
        System.out.println("--------");

        //创建篮球运动员对象，调用方法
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("--------");
        BasketballPlayer bbp = new BasketballPlayer("姚明", 35);
        System.out.println(bbp.getName() + ", " + bbp.getAge());
        bbp.study();
        bbp.eat();


    }
}
