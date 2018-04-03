package IO;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

/**
 * 1)	在当前目录下创建source和target文件夹，并在source文件夹中存放一个“IO流.avi”文件。
 * 2)	编写Example03类。
 * 3)	在main()方法中，分别创建文件字符输出流和文件字符输入流对象，并指定文件拷贝的源及目标路径。
 * 4)	自定义一个1024长度的字节数组作为缓冲区，然后通过输入流将源文件数据读取到缓冲区中，输出流再将缓冲区中数据写入到目标文件中，
 *      循环往复直到文件拷贝结束，并计算拷贝文件总耗时。
 * 5)	使用close()方法，关闭流资源。

 */

public class Domon02 {
    public static void main(String [] args) {

        Frame lpFrame = new Frame("IO01");
        lpFrame.addWindowListener(new lpNewWindow());
        lpFrame.addMouseListener(new lpNewMouse());
        lpFrame.setSize(800,500);
        lpFrame.setLayout(new BorderLayout());
        Panel panel01 = new Panel();
        panel01.setLayout(new GridLayout());
        Panel panel03 = new Panel();
        Button lpButton001 = new Button("File");
        Button lpButton002 = new Button("Setting");
        Button lpButton003= new Button("View");
        Button lpButton004 = new Button("Out");
        panel01.add(lpButton001);
        panel01.add(lpButton002);
        panel01.add(lpButton003);
        panel01.add(lpButton004);
        lpFrame.add(panel01, BorderLayout.NORTH);
        Button lpButton01 = new Button("Save");
        Button lpButton02= new Button("Cancel");
        panel03.setLayout(new GridLayout());
        panel03.add(lpButton02);
        panel03.add(lpButton01);
        lpFrame.add(panel03, BorderLayout.SOUTH);
        TextArea lpText = new TextArea(750,450);
        lpFrame.add(lpText, BorderLayout.CENTER);

        lpButton004.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = lpFrame;
                window.setVisible(false);
                window.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        lpButton01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    InputStream in = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fileFor03A\\计算机组成原理答案.pdf");
                    OutputStream out = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fileFor03B\\计算机组成原理答案[copy].pdf");
                    int len ;
                    long beginTime = System.currentTimeMillis();
                    while((len=in.read()) != -1) {
                        out.write(len);
                    }
                    long endTime = System.currentTimeMillis();
                    lpText.append("文件保存成功！" + '\n');
                    lpText.append("保存文件所需时间：" + (endTime-beginTime) + "毫秒。" + '\n');
                    in.close();
                    out.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        lpButton02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lpText.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        lpFrame.setVisible(true);



    }
}
