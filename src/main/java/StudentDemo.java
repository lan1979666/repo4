//学生 测试 类
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
//        s1.name=
        s1.card = "abc";
        //set方法给成员变量赋值
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();
        System.out.println(s1);

        //构造方法 给成员变量赋值
        Student s2 = new Student("林青霞", 30);
        s2.show();

    }

}


