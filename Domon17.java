package IO;

import java.io.File;

public class Domon17 {
    public static void main(String[] args) {
        // 创建一个代表目录的File对象
        File file = new File("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO");
        fileDir(file);					 // 调用fileDir删除方法
    }
    public static void fileDir(File dir) {
        File[] files = dir.listFiles(); // 获得表示目录下所有文件的数组

        for (int i =0 ;i<files.length;i++) {		 // 遍历所有的子目录和文件
            if (files[i].isDirectory()) {
                fileDir(files[i]);			 // 如果是目录，递归调用fileDir()
            }
            System.out.println(files[i].getAbsolutePath());	// 输出文件的绝对路径
        }

        for (File file : files) {		 // 遍历所有的子目录和文件
            if (file.isDirectory()) {
                fileDir(file);			 // 如果是目录，递归调用fileDir()
            }
            System.out.println(file.getAbsolutePath());	// 输出文件的绝对路径
        }
    }

}
