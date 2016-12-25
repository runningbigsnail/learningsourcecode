package day21;
import java.io.*;
/**
 * Created by zhangsanshi on 2016/10/6.
 */
/*
  可以用于操作基本数据类型的数据的流对象。
 */

public class Demo2104
{
    public static void main(String [] args) throws IOException
    {
       // writeData();
       // readData();
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("e:\\utf.txt"),"utf-8");
        osw.write("你好");
        osw.close();
    }
    public static void writeUTFDemo() throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("e:\\data.txt"));
        dos.writeUTF("NIHAO ");
        dos.close();

    }
    public static void readData() throws IOException {
        DataInputStream dis=new DataInputStream(new FileInputStream("e:\\data.txt"));
        int num=dis.readInt();
        boolean b=dis.readBoolean();
        double d=dis.readDouble();
        System.out.println("d::"+d);


    }
    public static void writeData() throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("e:\\data.txt"));
        dos.writeInt(234);
        dos.writeBoolean(true);
        dos.writeDouble(9887.534);
        dos.close();

    }
}
