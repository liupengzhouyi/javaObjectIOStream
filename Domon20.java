package IO;

import java.util.Arrays;

public class Domon20 {
    public static void main(String[] args) throws Exception {
        //转换成gb2312编码格式的字节数组
        byte[] bytes = "你好".getBytes("gb2312");
        System.out.println(Arrays.toString(bytes));
        //转换成utf-8编码格式的字节数组
        String s = new String(bytes, "utf-8");
        System.out.println(s);
    }

}
