package IO;

import java.io.File;

public class Domon18 {
    public static void main(String[] args) {
        File file = new File("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon18.txt");
        if (file.exists()) {
            System.out.println("文件删除成功："+file.delete());
        }else{
            System.out.println("该文件不存在");
        }
    }
}
