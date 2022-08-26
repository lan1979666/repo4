package com.Implements_01;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫对象，调用方法
        Jumpping J = new Cat();
        J.Jump();

        Animal A = new Cat();
        A.setName("加菲");
        A.setAge(5);
        System.out.println(A.getName() + ", " + A.getAge());
        A.eat();

        A = new Cat();
        A.setName("加菲");
        A.setAge(5);
        System.out.println(A.getName() + ", " + A.getAge());
        A.eat();

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + ", " + c.getAge());
        c.eat();
        c.Jump();

        Jumpping j = new Dog();
        j.Jump();

        Animal a = new Dog();
        a.setName("旺财");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Dog();
        a.setName("旺财");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        Dog d = new Dog();
        d.setName("旺财");
        d.setAge(5);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.Jump();


    }
}