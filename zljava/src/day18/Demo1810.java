package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/7.
 */
/*
*
*
*
* */
public class Demo1810
{
    public static void main(String [] args) throws IOException
    {
        //创建一个文件读取流对象，和指定名称的文件相关联。
        //要保证该文件已经是存在的，如果不存在，会发生异常FileNotFoundException异常。
        FileReader fr=new FileReader("e:\\demo.txt");
        //调用读取流对象的read方法。
        //read():一次读一个字符，会自动往下读，如果读到流的末尾，返回-1。
        //int ch=fr.read();
       // System.out.println("ch="+(char)ch);
       // int ch2=fr.read();
       // System.out.println("ch="+(char)ch2);
        //fr.close();
        int ch=0;
        while ((ch=fr.read())!=-1)
        {
            System.out.println((char)ch);
        }
        /*
        while (true)
        {
            int ch=fr.read();
            if (ch==-1)
                break;
            System.out.println((char)ch);
        }
        */

    }
}
