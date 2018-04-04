package IO;

import java.io.*;

/**1)	编写Example14类
        2)	在main()方法中使用ByteArrayInputStream(byte[] buf)构造方法，创建一个字节数组输入流对象，并将要一段字符串读取到缓冲区数组中
        3)	创建一个ByteArrayOutputStream，然后在while循环中，将字节数组输入流缓冲区中数据读取到输出流缓冲区中
        4)	将输出流缓冲区中的数据一次性输出到控制台
*/
public class Domon13 {
    public static void main(String [] args) {

        FileInputStream in = null;
        try {
            in = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon13I.txt");

            ByteArrayOutputStream bos = new ByteArrayOutputStream() ;

            FileOutputStream out = null;
            try {
                out = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon13II.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            int b = 0 ;
            while((b = in.read()) != -1) {
                System.out.print((char) b);
                bos.write((char) b);
            }

            in.close();

            out.write(bos.toByteArray());

            bos.close();

            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
