import java.util.Scanner;//导包
public class ScannerDome {
    public static void main(String[] args){
        //创建对象
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数据");
        //接收数据
        String line = sc.nextLine();



        //输出数据
        System.out.println(line);

    }
}
