package IO;

import java.io.*;

/**
 * 1)	编写Example11类。
 2)	在main()方法中通过DataOutputStream向“oos.txt”文件中，写入字符编码为UTF-8的字符串“你好”。
 3)	通过DataInputStream读取文件中该编码的字符串并打印。

 */
public class Domon10 {
    public static void main(String [] args) {

        try {
            FileOutputStream fos = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fosForDomon10.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos) ;
            DataOutputStream dos = new DataOutputStream(bos) ;
            dos.writeUTF("你好！") ;
            dos.close() ;

            FileInputStream fis = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fosForDomon10.txt") ;
            BufferedInputStream bis = new BufferedInputStream(fis) ;
            DataInputStream dis = new DataInputStream(bis) ;
            System.out.println(dis.readUTF());
            dis.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
