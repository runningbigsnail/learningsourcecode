package day19;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/23.
 */
/*
* 字符流：
* FileReader
* FileWriter
*
* BufferedReader
* BufferedWriter
*
*字节流：
*InputStream
*OutputStream
* 需求,想要操作图片数据，这时就要用到字节流。
*
* */
public class Demo1911
{
    public static void main(String [] args) throws IOException
    {
        //writeFile();
       // readFile();
        readFile_3();

    }
    public static void readFile_3() throws IOException
    {
        FileInputStream fis = new FileInputStream("e:\\fos.txt");
       // int num=fis.available();
       // System.out.println("num="+num);
       byte [] buf=new byte[fis.available()];//定义一个刚刚好的缓冲区
        //这种方式使用起来要小心，防止字节过多数组过大
        fis.read(buf);
        System.out.println(new String(buf));
       fis.close();
    }
    public static void readFile_2() throws IOException
    {
        FileInputStream fis= new FileInputStream("e:\\fos.txt");
        byte[] buf=new byte[1204];
        int len=0;
        while((len=fis.read(buf))!=-1)
        {
            System.out.println(new String(buf,0,len));
        }
    }

    public static void readFile() throws IOException
    {
        FileInputStream fis= new FileInputStream("e:\\fos.txt");
        int ch=0;
        while((ch=fis.read())!=-1)
        {
            System.out.println((char)ch);
        }
        fis.close();
    }
    public static void writeFile() throws IOException
    {
        FileOutputStream fos=new FileOutputStream("e:\\fos.txt");
        fos.write("abcde".getBytes());
        //不具备刷新功能，但需要关资源。
        fos.close();
    }
}
