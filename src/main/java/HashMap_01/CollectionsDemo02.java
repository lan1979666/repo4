package HashMap_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
ArrayList集合存储学生对象，要求年龄从小到大，年龄相同时，按姓名字母排序，使用Colletions工具
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();

        Student s1=new Student("linqingxia",30);
        Student s2=new Student("zhangmanyu",35);
        Student s3=new Student("wangzulan",33);
        Student s4=new Student("liuyan",33);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //Collections工具进行排序
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        for(Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
