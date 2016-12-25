package day19;
import java.io.*;
/**
 * Created by zhangsanshi on 2016/9/27.
 */
/*
* 读取键盘录入。
* System.out:对应的标准输出设备，控制台。
* System.in:对应的标准输入设备。
*
* 需求：通过键盘录入数据。
* 当录入一行数据后，就将改行数据进行打印。
* 如果录入的数据为over那么就停止录入。
* */
public class Demo1915
{
    public  static void main(String [] args) throws IOException {
        InputStream in=System.in;
        StringBuilder sb=new StringBuilder();
       // int ch=0;
        /*
        while((ch=in.read())!=-1)
        {
            System.out.println(ch);

        }
        in.close();
        */
        while(true)
        {
            int ch=in.read();
            if(ch=='\r')
                continue;
            if(ch=='\n')
            {
                String s=sb.toString();
                if("over".equals(s))
                    break;
                System.out.println(s.toUpperCase());
               // sb.delete(0,sb.length());
                sb=new StringBuilder();
            }
            else
                sb.append((char)ch);
        }
    }
}
