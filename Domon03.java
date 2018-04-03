package IO;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

/**
 * 1)	编写Person类，定义eat()方法，表示“吃饭”功能
 2)	编写NewPerson类，定义一个有参构造方法，通过构造方法可以将Person对象传入该类，在NewPerson类定义newEat()方法，该方法对“吃饭”功能进行了扩展和增强。
 3)	编写Example04测试类，在main()方法中，分别通过Person和NewPerson对象调用装饰前后的吃饭功能。
 */

public class Domon03{
    public static void main(String [] args) {
        Frame lpFrame = new Frame("IO01");
        lpFrame.addWindowListener(new lpNewWindow());
        lpFrame.addMouseListener  (new lpNewMouse());
        lpFrame.setSize(800,     500);
        lpFrame.setLayout(         new GridLayout());
        Panel lpPanel01 = new Panel(new BorderLayout());
        Panel lpPanel02 = new Panel(new BorderLayout());

        lpFrame.add(lpPanel01);
        lpFrame.add(lpPanel02);

        TextArea lpText01 = new TextArea(400, 450);
        TextArea lpText02 = new TextArea(400, 450);
        lpPanel01.add(lpText01 ,            BorderLayout.CENTER);
        lpPanel02.add(lpText02 ,            BorderLayout.CENTER);

        Button lpButton011 = new Button(  "SHOW");
        Button lpButton012 = new Button("Cancel");
        Button lpButton021 = new Button(  "SHOW");
        Button lpButton022 = new Button("Cancel");
        lpButton011.setBackground(Color.RED);
        lpButton021.setBackground(Color.RED);

        Panel lpPanelforButton01 = new Panel(new GridLayout());
        Panel lpPanelForButton02 = new Panel(new GridLayout());

        lpPanelforButton01.add(lpButton012);
        lpPanelforButton01.add(lpButton011);
        lpButton011.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Person obj = new Person(lpText01);
                obj.eat();
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
        lpPanelForButton02.add(lpButton022);
        lpButton021.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Person obj = new Person(lpText02);
                SpuerPerson obj01 = new SpuerPerson(obj, lpText02);
                obj01.eat();
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
        lpPanelForButton02.add(lpButton021);

        lpPanel01.add(lpPanelforButton01, BorderLayout.SOUTH);
        lpPanel02.add(lpPanelForButton02, BorderLayout.SOUTH);

        lpFrame.setVisible(true);
    }
}


class Person{
    private TextArea  tempText;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private String      string;
    public Person( TextArea tempText) {
        string = new String("我叫王晓宇，今天中午吃了一碗兰州拉面！" + '\n');
        this.tempText = tempText;
    }

    public void eat() {
        this.tempText.append(string);
    }


}

class SpuerPerson {
    private TextArea        tempText;
    private Person          lpPerson;
    private String            string;
    public SpuerPerson (Person person, TextArea temp) {
       this.lpPerson =        person;
       this.tempText =           temp;
       this.string = new String(lpPerson.getString() + "拉面里加了鸡蛋和丸子！" + '\n');
    }
    public void eat() {
        this.tempText.append(string);
    }
}