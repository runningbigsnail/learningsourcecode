package day19;

/**
 * Created by zhangsanshi on 2016/9/13.
 */
/*
* 通过缓冲区复制一个.java文件。
*readLine方法返回的时候只返回回车符之前的数据内容。并不返回回车符。
*
* */
import java.io.*;
public class Demo1903
{
    public static void main (String [] args)
    {
         BufferedReader bufr=null;
         BufferedWriter bufw=null;
        try
        {
            bufr=new BufferedReader(new FileReader("e:\\Demo.txt"));
            bufw=new BufferedWriter(new FileWriter("e:\\bufWriter_Copy.txt"));
            String line=null;
            while((line=bufr.readLine())!=null)
            {
               bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        }
        catch (IOException e)
        {
         throw new RuntimeException("读写失败");
        }
        finally
        {
            try
            {
                if(bufr!=null)
                bufr.close();
            }
            catch(IOException e)
            {
                throw new RuntimeException("读取关闭失败");
            }
            try
            {
                if(bufw!=null)
                    bufw.close();
            }
            catch(IOException e)
            {
                throw new RuntimeException("写入关闭失败");
            }
        }

    }
}
