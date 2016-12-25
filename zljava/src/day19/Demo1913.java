package day19;

import java.io.*;

/**
 * Created by zhangsanshi on 2016/9/23.
 */
public class Demo1913
{
    public static void main(String [] args) throws IOException {
        long start=System.currentTimeMillis();
        copy_1();
        long end=System.currentTimeMillis();
    }
    //通过字节流的缓冲区完成复制。
    public static void copy_1() throws IOException
    {
        BufferedInputStream bufis=new BufferedInputStream(new FileInputStream("e:\\2.jpg"));
        BufferedOutputStream bufos=new BufferedOutputStream(new FileOutputStream("e:\\3,jpg"));
        int by=0;
        while((by=bufis.read())!=-1)
        {
            bufos.write(by);
        }
        bufis.close();
        bufos.close();
    }

}
