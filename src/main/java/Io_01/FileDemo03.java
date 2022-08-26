package Io_01;

import java.io.File;
import java.io.IOException;

/*
File的判断和获取功能
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
       File f=new File("C:\\develop\\demo1\\java.txt");
        f.createNewFile();


        System.out.println(f.isDirectory());//判断是否是目录
        System.out.println(f.isFile());//判断是否是文件
        System.out.println(f.exists());//判断是否存在
        System.out.println("--------");


        System.out.println(f.getAbsoluteFile());//得到绝对路径
        System.out.println(f.getPath());//得到封装的路径 ：new File("C:\\develop\\demo1\\java.txt");
        System.out.println(f.getName());//得到文件名字
        System.out.println("--------");

        File f2=new File("E:\\itcast");
        String[] strArray = f2.list();//得到itcast目录下的所有目录和文件的字符串数组
        for(String str : strArray){
            System.out.println(str);
        }

        System.out.println("--------");

        File[] fileArray = f2.listFiles();//得到的是路径名表示的目录中的文件和目录的File对象数组
        for(File file:fileArray){
            //System.out.println(file);
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }

        //是对象，就可以调方法，得到File对象的文件和目录数组

    }
}
