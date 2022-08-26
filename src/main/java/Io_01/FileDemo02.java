package Io_01;

import java.io.File;
import java.io.IOException;

/*
File类 创建功能
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //在E:\\itcast目录下创建一个java.txt文件
        File f1=new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());

        //如果文件不存在就创建文件，返回true,如果文件存在就不创建文件，并返回flase
        System.out.println("--------");

        //在E:\\itcast目录下创建一个目录javaSE
        File f2=new File("E:\\itcast\\javaSE");
        System.out.println(f2.mkdir());

        System.out.println("--------");

        //在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3=new File("E:\\itcast\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());

        System.out.println("--------");

        //在itcast目录下创建一个文件javase.txt
        File f4=new File("E:\\itcast\\javase.txt");
        System.out.println(f4.createNewFile());





    }
}
