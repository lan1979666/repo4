package HashMap_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
创建一个ArrayList集合，存储三个元素HashMap，每个Hashmap的键和值都是String,并遍历
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hs1 = new HashMap<String, String>();
        hs1.put("孙策", "大乔");
        hs1.put("周瑜", "小乔");
        array.add(hs1);

        HashMap<String, String> hs2 = new HashMap<String, String>();
        hs2.put("郭靖", "黄蓉");
        hs2.put("杨过", "小龙女");
        array.add(hs2);

        HashMap<String, String> hs3 = new HashMap<String, String>();
        hs3.put("令狐冲", "任盈盈");
        hs3.put("林平之", "岳灵珊");
        array.add(hs3);

        //遍历
        for(HashMap<String, String> hm:array){
            Set<String> keySet = hm.keySet();
            for(String key:keySet){
                String value = hm.get(key);
                System.out.println(key+","+value);
            }
        }
        //遍历2
        for(HashMap<String, String> hm:array){
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for(Map.Entry<String, String> me:entries){
                String key = me.getKey();
                String value = me.getValue();
                System.out.println(key+","+value);
            }
        }

    }


}



