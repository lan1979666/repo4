//导包


import java.util.Scanner;

//import java.util.Scanner;
public class equalsTest {
    public static void main(String[] args) {
        //设置用户名和密码
  /*      String username = "itheima";
        String password = "123";

        //for循环
        for (int i = 0; i < 3; i++) {

            //接收数据
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String psd = sc.nextLine();

            //equals 相比较
            if (name.equals(username) && psd.equals(password)) {
                System.out.println("登录成功");
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账户被锁，请联系管理员");
                } else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }

            }
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        int bigCont = 0;
        int smallCont = 0;
        int numberCont = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCont++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCont++;
            } else if (ch >= '0' && ch <= '9') {
                numberCont++;
            }
        }
        System.out.println("大写字母个数；" + bigCont + "个");
        System.out.println("小写字母个数：" + smallCont + "个");
        System.out.println("数字个数：" + numberCont + "个");
    }

}


