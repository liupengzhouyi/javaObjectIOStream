package IO;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  1)	创建一个文本文件fis.txt，在文件中编辑内容“Welcome to learn IO stream!”。
    2)	在同一目录下创建Example01.java文件，编写Example01类。
    3)	在main()方法中，通过FileInputStream(String name)构造方法创建文件输入字节流对象，并指定待读取文件fis.txt的路径。
    4)	在while循环条件中使用read()方法每次读取一个字节，同时在循环体中打印每次读取的数据，当read()方法返回值为-1时表示读取到文件结尾，循环结束。
    5)	使用close()方法，关闭流资源。

 */
public class Domon0 {
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
                //String string = lpText.getText();
                int b= 0;
                try {
                    FileInputStream in = new FileInputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fis01.txt");
                    int i=0;
                    while(true) {
                        b = in.read();
                        if (b == -1) {
                            break;
                        }
                        lpText.append(String.valueOf((char)b));
                    }
                    in.close();
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
