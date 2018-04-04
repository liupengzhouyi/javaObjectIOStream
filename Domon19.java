package IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Domon19 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempTextForDomon19.txt ", "rw");
        raf.write("RandomAccessFile".getBytes());
        raf.seek(3);
        byte[] buf = new byte[6];
        int len = raf.read(buf);
        System.out.println(new String(buf,0,len));
        raf.close();
    }
}
