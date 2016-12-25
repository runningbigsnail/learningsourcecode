package day21;

import java.io.*;


/**
 * Created by zhangsanshi on 2016/10/5.
 */
public class Demo2101
{
    public static void main(String [] args) throws IOException, ClassNotFoundException {
        writeObj();
        readObj();
    }
    public static void writeObj() throws IOException
    {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:\\obj1.txt"));
        oos.writeObject(new Person("lisi0",399,"kr"));
        oos.close();

    }
    public static void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:\\obj1.txt"));
        Person p=(Person)ois.readObject();
        System.out.println(p);
        ois.close();

    }
}
