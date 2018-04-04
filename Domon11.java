package IO;

import java.io.IOException;
import java.io.InputStream;

/**
 * 1)	编写Example12类。
 2)	在main()方法中使用System.in读取键盘输入的数据
 3)	使用while循环读取键盘输入的数据
 4)	当输入回车时，使用toUpperCase()方法将输入的数据转换成大写字母
 5)	当输入“over”时程序结束

 */
public class Domon11 {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder();
        //InputStream是字节读取流的最高父类
        InputStream in = System.in;
        //InputStream中的方法，read()
        int len = 0;
        // while循环用于读取键盘输入的数据
        while(true){
            try {
                len = in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(len == -1){
                System.out.println("=============");
            }
            if(len == '\r')
                continue;
            if(len == '\n'){
                String s = sb.toString();
                if("over".equals(s))
                    break;
                //将键盘输入的内容转换成大写字母
                System.out.println(s.toUpperCase());
                sb.delete(0, sb.length());
            }else{
                sb.append((char)len);
            }
        }



    }
}
