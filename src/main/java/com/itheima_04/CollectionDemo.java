package com.itheima_04;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        /*Collection<Student> c=new ArrayList<Student>();
        Student s=new Student("林青霞",30);
//        s.setName("林青霞");
//        s.setAge(30);
//        System.out.println(s.getName()+","+s.getAge());
        Student s1=new Student("张曼玉",33);
        Student s2=new Student("王祖贤",35);

        c.add(s);
        c.add(s1);
        c.add(s2);

        //遍历集合
        //迭代器遍历
        Iterator<Student> it =c.iterator();
        while(it.hasNext()){
            Student sd = it.next();
            System.out.println(sd.getName()+","+sd.getAge());
        }
        //迭代器遍历
        Iterator<Student> it1=c.iterator();
        while(it1.hasNext()){
            Student ss=it1.next();
            System.out.println(ss.getName()+","+ss.getAge());
        }

        //增强for遍历
        for(Student sd1:c){
            System.out.println(sd1.getName()+","+sd1.getAge());
        }
*/
       Collection<String> c=new ArrayList<String>();
       c.add("hello");
       c.add("world");
       c.add("java");

        //System.out.println(c.remove(0));
        //System.out.println(c.remove("java"));
        //c.clear();
        System.out.println(c.contains("hello"));
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains("world"));
        System.out.println(c.isEmpty());
        System.out.println(c.remove("java"));
        c.add("javaee");

        Collection<Integer> c1=new ArrayList<Integer>();


        System.out.println(c);


    }
}
