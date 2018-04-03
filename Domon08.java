package IO;

import java.io.*;

/**
 * 1)	在source目录下编写“HelloWrold.java”文件，里面有一段HelloWorld程序。
    2)	在同一目录下，编写Example09类。
    3)	在main()方法中，创建文件字节输入和输出流对象，然后分别使用转换流包装，为提高效率，最后再通过缓冲流包装。
    4)	使用readLine()方法循环一行行读取源文件并转大写写入到目标文件，直至文件末尾。
    5)	调用close()方法，关闭流资源。


 */


public class Domon08 {
    public static void main(String [] args) {

        try {

            FileInputStream lpInput = new FileInputStream
                    ("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\Domon08.java");

            InputStreamReader lp_isr = new InputStreamReader(lpInput);

            BufferedReader lp_reader = new BufferedReader(lp_isr);

            FileOutputStream lpOutput = new FileOutputStream
                    ("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempForDomon08.txt");

            OutputStreamWriter lp_out = new OutputStreamWriter(lpOutput);

            BufferedWriter lpWriter = new BufferedWriter(lp_out);

            String lpString = new String();

            while((lpString = lp_reader.readLine()) != null) {
                lpString = lpString.toUpperCase();
                //System.out.println(lpString);
                lpWriter.write(lpString );
            }
            lpInput.close();
            lpOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
