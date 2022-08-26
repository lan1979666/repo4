package com.itheima_04;

/*
自定义异常类
*/
public class ScoreException extends Exception{

    public ScoreException(){}

    public ScoreException(String massage){
        super(massage);
    }

}
