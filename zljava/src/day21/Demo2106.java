package day21;
import java.io.*;
/**
 * Created by zhangsanshi on 2016/10/6.
 */
/*
* 编码表
*
*
*
* */
public class Demo2106
{
    public static void main(String [] args) throws IOException {
        //writeText();
        readText();
    }
    public static void readText() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("e:\\gbk.txt"),"GBK");
        char [] buf=new char[10];
        int len=isr.read(buf);
        String str=new String(buf,0,len);
        System.out.println(str);
        isr.close();


    }
    public static void writeText() throws IOException
    {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("e:\\gbk.txt"),"GBK");
        osw.write("你好");
        osw.close();
    }
}
