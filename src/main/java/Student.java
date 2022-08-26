//学生类
public class Student {
    //成员变量
    private String name;
    private int age;

    public String card;

    //无参构造
    public Student() {

    }

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //使用get/set 方法
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student show() {
        System.out.println(name + ", " + age);
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", card='" + card + '\'' +
                '}';
    }
}


