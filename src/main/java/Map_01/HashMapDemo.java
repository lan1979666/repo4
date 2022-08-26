package Map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
创建HashMap集合,键是学号，值是学生对象，存储三个键值对象，并遍历
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hs=new HashMap<String,Student>();

        //创建学生对象
        Student s1=new Student("林青霞",30);
        Student s2=new Student("张曼玉",35);
        Student s3=new Student("王祖贤",33);

        hs.put("001",s1);
        hs.put("002",s2);
        hs.put("003",s3);

        //遍历1
        Set<String> keySet = hs.keySet();
        for(String key:keySet){
            Student value = hs.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        //遍历2
        Set<Map.Entry<String, Student>> entries = hs.entrySet();
        for(Map.Entry<String, Student> me:entries){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

    }
}
