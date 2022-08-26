package Poker01;

import java.util.ArrayList;
import java.util.Collections;

/*
模拟斗地主，洗牌，发牌，看牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<String>();

        //往牌盒装牌
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("大王");
        array.add("小王");

        //洗牌
        Collections.shuffle(array);
        //发牌,创建每个人的集合
        ArrayList<String> lqArray = new ArrayList<String>();
        ArrayList<String> lhArray = new ArrayList<String>();
        ArrayList<String> ljArray = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                lqArray.add(poker);
            } else if (i % 3 == 1) {
                lhArray.add(poker);
            } else if (i % 3 == 2) {
                ljArray.add(poker);
            }
        }
        //看牌,调用方法
        lookPoker("刘倩", lqArray);
        lookPoker("刘欢", lhArray);
        lookPoker("刘俊", ljArray);
        lookPoker("底牌", dpArray);
    }
    //看牌方法，遍历
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
