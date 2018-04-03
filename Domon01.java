package IO;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 *  1)	编写Example02类。
 *  2)	在main()方法中，通过FileOutputStream(String name)构造方法创建文件输出字节流对象，并指定写入的文件路径。
 *  3)	定义一段字符串，并将它转换成byte数组，然后通过write(byte[] b)方法，将byte数组写入到文件输出流中。
 *  4)	使用FileOutputStream类的close()方法，关闭流资源。

 */
public class Domon01 {
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
                String string = lpText.getText();
                try {
                    FileOutputStream out = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\fis02.txt");
                    byte[] by = string.getBytes();
                    for (int i=0;i<by.length;i++) {
                        out.write(by[i]);
                    }
                    lpText.setText("文件保存成功！");
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
