package IO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 1)	定义一个类，命名为Input，该类实现Runnable接口，控制管道输入流的读操作
 2)	定义一个类，命名为Output，该类也实现Runnable接口，控制管道输出流的写操作
 3)	编写类Example13，将两个管道流连接起来

 */


//定义类，实现Runnable，控制输入
class Input implements Runnable{
    private PipedInputStream pis;
    Input(PipedInputStream pis){
        this.pis = pis;
    }
    public void run(){
        try{
            byte[] buf = new byte[10];
            int len = 0 ;
            len = pis.read(buf);
            System.out.println(new String(buf,0,len));
            pis.close();
        }catch(IOException e){}
    }
}

//定义类，实现Runnable接口，控制输出
class Output implements Runnable{
    private PipedOutputStream pos;
    Output(PipedOutputStream pos){
        this.pos = pos;
    }
    public void run(){
        try{
            Thread.sleep(3000);
            pos.write("管道流你好".getBytes());
        }catch(Exception e){}
    }
}


public class Domon12 {
    public static void main(String [] args) {

        //建立管道流对象
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        //两个管道流。连接起来
        try {
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new Input(pis)).start();
        new Thread(new Output(pos)).start();




    }
}
