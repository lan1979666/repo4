package com.extendstest;

public class IdCard {

    //身份证号
    private String cardNo;

    public IdCard() {

    }

    public IdCard(String cardNo) {
        System.out.println("父类构造方法执行了");
        System.out.println("cardNo1:" + cardNo);
        this.cardNo = cardNo;
        System.out.println("cardNo2:" + this.cardNo);
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
