package IO;

import java.io.*;

/**
 * 1)	编写一个类Example15
 2)	在main()方法中，使用FileReader读取caw.txt文件中的内容，然后创建CharArrayWriter对象，将读取的内容写入到CharArrayWriter缓冲区。
 3)	创建CharArrayReader对象，读取字符数组缓冲区中的数据并打印

 */
public class Domon14 {
    public static void main(String [] args) {
        FileReader fr = null;// 创建一个FileReader对象
        try {
            fr = new FileReader("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon14.txt") ;

            CharArrayWriter chaw = new CharArrayWriter();// 在内存中创建一个字符数组缓冲区
            // 下面的代码是将数据写入缓冲区
            int b;
            while ((b = fr.read()) != -1) {
                chaw.write(b); // 将读取到的字符写入缓冲区
            }
            fr.close();
            chaw.close();
            char[] chs = chaw.toCharArray();// 将缓冲区中的数据转换成字符型数组
            CharArrayReader cr = new CharArrayReader(chs);// 读取字符数组中的数据
            // 下面的代码是从缓冲区中读取数据，并进行打印
            int i = 0;
            while ((i = cr.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
