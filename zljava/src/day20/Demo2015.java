package day20;

import java.io.*;

/**
 * Created by zhangsanshi on 2016/10/4.
 */
/*
* java中的其他流对象。
* 打印流：
* 该流提供了打印方法，可以将各种数据类型的数据都原样打印。
* 字节打印流：
* PrintStream
* 构造函数可以接受的参数类型。
* 1，file对象File
* 2，字符串路径String
* 3，字节输出流。OutputStream
* 字符打印流
* PrintWriter
*1，file对象File
* 2，字符串路径String
* 3，字节输出流。OutputStream
* 4,字符输出流，Writer。
* */
public class Demo2015
{
    public static void main(String [] args) throws IOException {
            BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out=new PrintWriter(new FileWriter("e:\\a.txt"),true);
        String line=null;
        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
            out.println(line.toUpperCase());
           // out.flush();
        }
        out.close();
        bufr.close();
    }
}
