package IO;

import java.io.*;

/**
 * 1)	编写Person类，实现序列化接口，在类中定义name和age属性，生成get ()和set()方法，并重写toString()方法。
 2)	编写Example10类，在main()方法中通过ObjectOutputStream将赋值后的Person对象序列化到“oos.txt”文件。
 3)	通过ObjectInputStream读取该文件实现Person对象的反序列化，并打印该对象

 */
public class Domon09 {
    public static void main(String [] args) {

        PersonForDomon09 lp_p1 = new PersonForDomon09("liupeng", 22);
        System.out.print(lp_p1.toString());

        try {
            FileOutputStream lp_out = new FileOutputStream("G:\\Code\\JetBrains_IntelliJ_code\\src\\IO\\tempFileTXTForDomon09.txt");

            ObjectOutputStream lp_objectStream = new ObjectOutputStream(lp_out);

            lp_objectStream.writeObject(lp_p1);



           //FileInputStream






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

class PersonForDomon09 implements Serializable{

    public PersonForDomon09(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
}


/*
@Override
    public String toString() {
        String me = new String("name :" + this.getName() + ", age: " + this.getAge() + "." );
        return me;
    }
 */