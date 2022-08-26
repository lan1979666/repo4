package com.itheima_05;

public class Student01 implements Comparable<Student01> {
    private String name;
    private int age;

    public Student01() {
    }

    public Student01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student01 s) {
        //return 0;   只输出第一个
        //return 1;   按照输入的顺序 输出
        //returen -1; 按照输入的顺序倒着输出
        /*int num = this.age-s.age;   年龄按 从小到大排列输出
        return num;    */
        /*int num = s.age-this.age;    年龄按从大到小 排列输出
        return num;*/

        int num = this.age - s.age;

        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;

    }
}
