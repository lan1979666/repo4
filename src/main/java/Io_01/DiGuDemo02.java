package Io_01;

import java.io.File;

/*
递归案例：给定一个路径，通过递归完成遍历改目录下的所有内容，
        并把所有的文件的绝对路径输出在控制台
 */
public class DiGuDemo02 {
    public static void main(String[] args) {
        File srcArray = new File("C:\\develop\\demo1");

        getAllFilePath(srcArray);


    }

    public static void getAllFilePath(File srcArray) {
        File[] fileArray = srcArray.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }


}
