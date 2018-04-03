package IO;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

/**
 *
 * 1)	创建一个文本文件fr.txt，在文件中输入内容“Welcome to learn IO stream!”。
 2)	在同一目录下创建Example06.java文件，编写Example06类。
 3)	在main()方法中，通过FileReader(String fileName)构造方法创建字符输入流对象，并指定待读取文件fr.txt的路径。
 4)	使用read()方法循环读取并输出数据，当方法返回值为-1时表示读取到文件结尾，循环结束。
 5)	使用close()方法，关闭流资源。



 */
public class Domon05 {
    public static void main(String [] args) {
        Frame lpMainWindow = new Frame("IO05");
        lpMainWindow.setSize(1000, 800);
        lpMainWindow.addWindowListener(new lpNewWindow());
        lpMainWindow.addMouseListener(new lpNewMouse());
        Panel lp_p1 = new Panel();
        lpMainWindow.add(lp_p1);
        lp_p1.setBackground(Color.GREEN);
        TextArea lText = new TextArea(800, 500);
        lp_p1.setLayout(new BorderLayout());
        lp_p1.add(lText, BorderLayout.CENTER);
        Panel lp_p2 = new Panel();
        lp_p2.setLayout(new GridLayout());
        Button lp_button01 = new Button("Read");
        Button lp_Button02 = new Button("CANECL");

        lp_button01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    FileReader lpReader = new FileReader("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fis01.txt");

                    int ch ;

                    while((ch = lpReader.read()) != -1) {
                        char c = (char) ch;
                        String string = new String(c + "");
                        lText.append(string);
                    }

                    lpReader.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
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

        lp_Button02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = lpMainWindow;
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


        lp_p2.add(lp_Button02);
        lp_p2.add(lp_button01);

        lp_p1.add(lp_p2, BorderLayout.SOUTH);

        lpMainWindow.setVisible(true);
    }
}
