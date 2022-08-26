package Io_01;

import java.io.File;
import java.io.IOException;

/*
File类的删除功能
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
//        File f=new File("C:\\develop\\demo1\\java.txt");
//        System.out.println(f.createNewFile());

        /*File f1=new File("java.txt");
        System.out.println(f1.createNewFile());
        f1.delete();*/

        /*File f2=new File("C:\\develop\\demo1\\java.txt");
        System.out.println(f2.mkdir());
        System.out.println(f2.delete());*/

        File f3=new File("C:\\develop\\demo1\\itcast");
        System.out.println(f3.mkdir());
        File f4=new File(f3,"java.txt");
        System.out.println(f4.createNewFile());

        System.out.println(f3.delete());//删除的目录 下面有文件，不能直接删除目录，要先删除文件，再删除目录




    }
}
