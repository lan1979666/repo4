package com.itheima_05;

import java.util.Objects;

public class Student02 {
    private String name;
    private int age;

    public Student02() {
    }

    public Student02(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student02 student02 = (Student02) o;
        return age == student02.age && Objects.equals(name, student02.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
