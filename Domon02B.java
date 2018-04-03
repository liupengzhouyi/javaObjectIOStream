package IO;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class Domon02B {
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
                    byte[] buff = new byte[1024];
                    long beginTime = System.currentTimeMillis();
                    while((len=in.read(buff)) != -1) {
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
