package com.DuoTai_01;

/*
测试类
*/
public class AnimalDemo {
    public static void main(String[] args) {

       /* //创建猫类对象，进行测试
        //无参构造
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        //带参构造
        a = new Cat("加菲", 5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        //创建狗类对象，进行测试
        //无惨构造
        Animal b=new Dog();
        b.setName("旺财");
        b.setAge(5);
        System.out.println(b.getName()+", "+b.getAge());
        b.eat();

        //带参构造
        b=new Dog("旺财",5);
        System.out.println(b.getName()+", "+b.getAge());
        b.eat();
*/
//        Pig a=new Pig();
//        a.eat();
//          Pig a=new Pig();
        //抽象类创建对象
        Pig a =new Duck();
        a.eat();
        a.sleep();








    }
}
