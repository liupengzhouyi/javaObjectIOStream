package IO;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class Domon16 {
    public static void main(String[] args) throws IOException {
        // 创建File文件对象,表示一个文件
        File file = new File("testTempForDomon16.txt");
        // 判断文件是否存在
        System.out.println("文件是否存在：" + (file.exists() ? "存在" : "不存在"));
        if (!file.exists()) {
            // 如果文件不存在便创建该文件
            boolean ifcreat1 = file.createNewFile();
            System.out.println("文件是否创建成功：" + ifcreat1);
        }
        // 获取文件名称
        System.out.println("文件名称:" + file.getName());
        // 获取文件的相对路径
        System.out.println("文件的相对路径:" + file.getPath());
        // 获取文件的绝对路径
        System.out.println("文件的绝对路径:" + file.getAbsolutePath());
        // 获取文件的父路径
        System.out.println("文件的父路径:" + file.getParent());
        // 判断是否是一个绝对路径
        System.out.println(file.isAbsolute() ? "是绝对路径" : "不是绝对路径");
        // 判断是否是一个隐藏文件
        System.out.println(file.isHidden() ? "是隐藏文件" : "不是隐藏文件");
        // 判断是否是一个文件
        System.out.println(file.isFile() ? "是一个文件" : "不是一个文件");
        // 判断是否是一个目录
        System.out.println(file.isDirectory() ? "是一个目录" : "不是一个目录");
        // 判断文件是否可读
        System.out.println(file.canRead() ? "文件可读" : "文件不可读");
        // 判断文件是否可写
        System.out.println(file.canWrite() ? "文件可写" : "文件不可写");
        // 得到文件最后修改时间，并将毫秒数转成日期
        long time = file.lastModified();
        Date d = new Date(time);
        String date = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG).format(d);
        System.out.println("最后修改时间为:" + date);
        // 得到文件的大小
        System.out.println("文件大小为:" + file.length() + " bytes");
    }

}
