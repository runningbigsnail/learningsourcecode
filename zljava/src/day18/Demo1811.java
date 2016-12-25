package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/7.
 */
/*
* 第二种方式：通过字符数组进行读取。
*
* */
public class Demo1811
{
    public static void main(String [] args) throws IOException
    {
        FileReader fr=new FileReader("e:\\demo.txt");
        //定义一个字符数组，用于存储读到字符。
        //该read(char[])返回的是读到字符个数。
        char[] buf=new char[3];
        /*
        int num=fr.read(buf);
        System.out.println("num="+num+"..."+new String(buf));
        int num2=fr.read(buf);
        System.out.println("num="+num2+"..."+new String(buf));
        fr.close();
        */
        int num=0;
        while ((num=fr.read(buf))!=-1)
        {
        System.out.print(new String(buf,0,num));
        }
        fr.close();
    }

}
