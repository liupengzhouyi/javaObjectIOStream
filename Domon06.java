package IO;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Domon06 {
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
        Button lp_button01 = new Button("Writer");
        Button lp_Button02 = new Button("CANECL");

        lp_button01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    FileWriter lpWriter = new FileWriter
                        ("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\testFileFor06.txt");
                    String string = lText.getText();
                    lpWriter.write(string);
                    lpWriter.write('\n');



                    lpWriter.close();

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
