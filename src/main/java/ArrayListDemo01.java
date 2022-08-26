import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<ArrayListStudent> array = new ArrayList<ArrayListStudent>();
        ArrayList<String> array1 = new ArrayList<String>();//泛型

        addStudnet(array);
        addStudnet(array);
        addStudnet(array);


        //添加 学生对象 到集合中
        for (int i = 0; i < array.size(); i++) {
            ArrayListStudent s = array.get(i);
            System.out.println(s.getName()+", "+s.getAge());
        }


        //遍历 集合


    }

    public static void addStudnet(ArrayList<ArrayListStudent> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象

        ArrayListStudent s = new ArrayListStudent();
        s.setName(name);
        s.setAge(age);

        array.add(s);
    }


}



