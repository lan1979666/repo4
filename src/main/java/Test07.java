import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> array =new ArrayList<String>();



        array.add("hello");
        array.add("world");
        array.add("java");

        for(int i=0;i<array.size();i++){
            String s= array.get(i);
            System.out.println(s);
        }


        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        String a = myReverse(line);

        System.out.println(a);


    }

    public static String myReverse(String s) {
       /* StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;*/

        return new StringBuilder(s).reverse().toString();
    }

}






