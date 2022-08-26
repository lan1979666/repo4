package Comparator_02;

import java.util.Comparator;
import java.util.TreeSet;

/*
成绩排序：创建TreeSet集合对象，使用带参构造方法，通过比机器complarator进行排序
        要求，按照总分从高到低
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> t = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                int num=(s1.getChinese()+s1.getMath())-(s2.getChinese()+s2.getMath());
//                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                int num = s2.getSum() - s1.getSum();
                int num2=num==0?s2.getChinese()-s1.getChinese():num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });
        //创建学生对象
        Student s1 = new Student("林青霞", 98, 100);
        Student s2 = new Student("张曼玉", 95, 95);
        Student s3 = new Student("王祖贤", 100, 93);
        Student s4 = new Student("柳岩", 100, 97);
        Student s5 = new Student("风清扬", 98, 98);
        Student s6 = new Student("左冷禅", 97, 99);
        Student s7 = new Student("赵云", 98, 98);

        //把学生对象添加到集合中
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);
        t.add(s6);
        t.add(s7);

        //遍历集合
        for (Student s : t) {
            System.out.println(s.getName() + "总分：" + s.getSum() + "," + s.getChinese() + "," + s.getMath());
        }


    }
}
