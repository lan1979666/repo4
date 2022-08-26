package Map_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建对象
        //Map<String,String> map=new HashMap<String,String>();

        //添加对象到集合
//        map.put("张无忌","赵敏");
//        map.put("郭靖","黄蓉");
//        map.put("杨过","小龙女");

        //集合中的基本功能
//        System.out.println(map.remove("001"));
//        System.out.println(map.remove("002"));

        //map.clear();
//        System.out.println(map.containsKey("001"));
//        System.out.println(map.containsValue("张曼玉"));

//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭襄"));

//        System.out.println(map.isEmpty());
//
//        System.out.println(map.size());


        //Map集合的获取功能
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //得到键
       /* Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        //得到值
        Collection<String> value = map.values();
        for(String values:value){
            System.out.println(value);
        }*/

        //遍历 方式1
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(value+key);
        }

        //遍历 方式2
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me:entries){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+value);
        }


//        System.out.println(map.get("张无忌"));
//        System.out.println(map.get("张三丰"));
//        System.out.println(map.containsKey("郭襄"));

        //获取所有键的集合：ketSet()
//        Set<String> s = map.keySet();
//        for(String m : s)
//            System.out.println(m);

//        Set<String> keySet = map.keySet();
//        for(String key:keySet){
//            System.out.println(key);
//        }
        System.out.println("--------");

        //获取所有值的集合
//        Collection<String> values = map.values();
//        for(String value : values){
//            System.out.println(value);
//        }
//        Collection<String> values = map.values();
//        for(String value:values){
//            System.out.println(value);
//        }

//        Set<String> keySet=map.keySet();
//        for(String key:keySet)
//            System.out.println(key);
//
//        Collection<String> values=map.values();
//        for(String value:values)
//            System.out.println(value);

        //遍历，根据键去找值
        /*Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+","+value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me : entries){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }*/
       /* Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me:entries){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }*/





        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key+","+value);
        }*/
        /*Set<String> keySet = map.keySet();
        for(String key:keySet){
            String values = map.get(key);
            System.out.println(key+","+values);
        }*/
        System.out.println("--------");
        //遍历 方式2 获取所有键值对象的集合
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me:entries){
            String key = me.getKey();
            String value = me.getValue();

            System.out.println(key+","+value);
        }*/

        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me:entries){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }*/
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> me:entries){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }*/



        //输出集合
        System.out.println(map);


    }
}
