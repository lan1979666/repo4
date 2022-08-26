package Io_01;

import java.io.File;

/*
Io流-File 是一个类，File:文件的意思，需要导包, 不会生成文件，只会在控制台输出路径
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File f1=new File("E:\\itcast\\bos.tst");
        System.out.println(f1);


        File f2=new File("E:\\itcast","bow.java");
        System.out.println(f2);

        File f3=new File("E:\\itcast");
        File f4=new File(f3,"bor.txt");
        System.out.println(f4);
    }
}
