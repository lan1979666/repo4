package Generic_01;

public class GenericDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1=new Student();
        s1.setName("林青霞");
        System.out.println(s1.getName());

        Teacher t=new Teacher();
        t.setAge(30);

        System.out.println(t.getAge());


        //一个方法，参数接收不同的类型
        Generic<String> g1=new Generic<String>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2=new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3=new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());



    }
}
