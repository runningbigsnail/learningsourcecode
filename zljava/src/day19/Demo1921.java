package day19;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangsanshi on 2016/10/2.
 */
public class Demo1921
{
    public static void main(String [] args)
    {
        try
        {
            int [] arr=new int[2];
            System.out.println(arr[3]);
        }
        catch(Exception e)
            {
                try
                {
                    Date d=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
                    PrintStream ps=new PrintStream("e:\\exception.log");
                    ps.write(d.toString().getBytes());
                    ps.println(" ");
                  System.setOut(new PrintStream(ps));
                }
                catch(IOException ex)
                {
                   throw new RuntimeException("日志文件创建失败");
                }
                e.printStackTrace(System.out);
            }

    }
}
//log4j专门工具包，建立日志信息。
