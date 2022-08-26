package com.itheima_04;

public class Teacher {
    public void checkSocre(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException("你输入的分数有误，分数应该在0-100之间");
        }else{
            System.out.println("分数正常");
        }
    }



}
