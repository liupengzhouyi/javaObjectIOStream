package IO;

import java.io.*;

public class Domon15 {
    public static void main(String [] args) {
        // 下面的代码是创建了两个流对象fis1、fis2
        FileInputStream fis1 = null;
        try {
            fis1 = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon15A.txt");

            FileInputStream fis2 = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon15B.txt");
            // 创建一个序列流，合并两个字节流fis1和fis2
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            FileOutputStream fos = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon15AB.txt");
            int len;
            byte[] buf = new byte[1024]; // 创建一个1024个字节数组作为缓冲区
            // 下面的代码用于循环读取三个流中的文件
            while ((len = sis.read(buf)) != -1) {
                fos.write(buf, 0, len); // 将缓冲区中的数据输出
            }
            sis.close();
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
