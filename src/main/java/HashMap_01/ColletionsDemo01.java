package HashMap_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections针对集合操作的工具
 */
public class ColletionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(10);

        Collections.sort(list);//自然排序

        Collections.reverse(list);//反转

        Collections.shuffle(list);//随机排列洗牌
        System.out.println(list);

    }
}
