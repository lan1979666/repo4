package com.extendstest;

public class People extends IdCard {

    private String name;
    private String age;
    private String sex;

    public People(){}
    public static void main(String[] args) {
        People people = new People("","","","4206833479684786");
    }

    public People(String name,String age,String sex,String idCardNo){
        super(idCardNo);//调用父类构造方法
        System.out.println("子类构造方法执行了--");
        super.setCardNo("123");//调用父类方法
        System.out.println(super.getCardNo());
        this.name=name;
        this.age=age;
        this.sex=sex;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
