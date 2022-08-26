package Comparator_01;
/*
存储学生对象，TreeSet带参构造方法，使用比较器Comparator,要求：年龄从小到大排序，年龄相同时，按姓名字母排序
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建TreeSet对象, 带参构造方法
        TreeSet<Student> t = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int sum=s1.getAge()-s2.getAge();//s1==this,  s2==s,
                int sum2=sum==0?s1.getName().compareTo(s2.getName()):sum;
                return sum2;
            }
        });
        //创建学生对象
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("daiochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        Student s5=new Student("linqingxia",33);
        Student s6=new Student("linqingxia",33);

        //把学生对象添加到集合中
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);
        t.add(s6);

        //遍历集合
        for (Student s : t) {
            System.out.println(s.getName() + "," + s.getAge());
        }


    }
}
