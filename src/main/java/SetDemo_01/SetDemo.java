package SetDemo_01;
/*
案例：不重复的随机数，取10个 不重复的随机数到集合里面，随机数取值范围1-20之间
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<Integer> s = new HashSet<Integer>();  //HashSet 集合中没有重复元素，取出的顺序不一致
        Set<Integer> s1=new TreeSet<Integer>();


        //创建随机数对象
        Random r = new Random();

        //判断集合的长度是不是小于10
        while (s1.size() < 10) {
            int number = r.nextInt(20)+1;
            s1.add(number);
        }

        //遍历集合
        for (Integer i : s1) {
            System.out.println(i);
        }


    }
}
