package day20;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by zhangsanshi on 2016/10/5.
 */
/*
* 序列流作用：
* 将多个读取流合并成一个读取流。
* */
public class Demo2016
{
    public static void main(String [] args) throws IOException {
        Vector<FileInputStream> v=new Vector<FileInputStream>();

        v.add(new FileInputStream("e:\\1.txt"));
        v.add(new FileInputStream("e:\\2.txt"));
        v.add(new FileInputStream("e:\\3.txt"));
        Enumeration<FileInputStream> en=v.elements();
        SequenceInputStream sis=new SequenceInputStream(en);
        FileOutputStream fos=new FileOutputStream("e:\\4.txt");
        byte [] buf=new byte[1024];
        int len=0;
        while((len=sis.read(buf))!=-1)
        {
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }
}
