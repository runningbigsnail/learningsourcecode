package day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/10.
 */
/*
* 复制的原理：
* 其实就是将c盘下的文件数据存储到D盘的文件中。
* 步骤：
* 1，在D盘创建一个文件，用于存储C盘文件中的数据。
* 2，定义读取流和C盘文件关联。
* 3，通过不断的读写完成数据存储。
* 4，关闭资源。
* */
public class Demo1813
{
    //从C盘读取一个字符，就往D盘写一个字符。
    public static void main(String[] args)
    {

        copy_2();
    }
    public static void copy_2()
    {
        FileWriter fw=null;
        FileReader fr=null;
        try
        {
            fw=new FileWriter("e:\\SytemDemo_copy.txt");
            fr=new FileReader("e:\\SystemDemo.java");
            char[] buf=new char[1024];
            int len=0;
            while ((len=fr.read(buf))!=-1)
            {
             fw.write(buf,0,len);
            }
        }
       catch (IOException e)
       {
           throw new RuntimeException("读写失败");
        }
        finally
        {
            if(fr!=null)
             try
             {
                 fr.close();
             }
             catch(IOException e)
             {
             }
             if(fw!=null)
            try
            {
                fw.close();
            }
            catch(IOException e)
            {
            }
        }

    }

    public static void copy_1() throws IOException
    {
        //创建目的地。
        FileWriter fw=new FileWriter("e:\\RuntimeDemo.txt");
        //与已有文件关联。
        FileReader fr=new FileReader("e:\\Demo.txt");
        int ch=0;
        while ((ch=fr.read())!=0)
        {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
