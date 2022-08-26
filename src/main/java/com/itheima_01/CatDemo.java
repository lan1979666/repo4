package com.itheima_01;

public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，调用方法

        CatOperator co = new CatOperator();

        Cat c = new Cat();
        co.useCat(c);

        Animal a = co.getAnimal();
        a.animal();


    }
}
