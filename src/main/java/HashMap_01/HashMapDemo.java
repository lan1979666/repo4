package HashMap_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
创建HashMap集合,存储学生对象并遍历，键是学生对象，值是居住地，要求：保证键的唯一性，如果学生对象成员变量值相同，就是同一个对象
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建对象
        HashMap<Student,String> hm=new HashMap<Student,String>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);
        Student s4 = new Student("王祖贤", 33);

        //添加对象到集合中
        hm.put(s1, "西安");
        hm.put(s2, "武汉");
        hm.put(s3, "北京");
        hm.put(s4, "郑州");

       //遍历
        Set<Student> keySet = hm.keySet();
        for(Student key:keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
        //遍历2
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for(Map.Entry<Student, String> me:entries){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }

    }
}
