package HashMap_01;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
键盘录入一个字符串，统计每个字符串出现的次数，例如aababcadabcde,a(5b(4)c(3)d(2)e(1);
            键：character, 值：integer
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();


        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hm.get(key);
            if (value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");

        }
//        String result = sb.toString();
//        System.out.println(result);
        System.out.println(sb);
    }
}
