package day21;
import java.io.*;
import java.util.Arrays;

/**
 * Created by zhangsanshi on 2016/10/6.
 */
/*
* 编码：字符串编程字节数组。
*
* 解码：字节数组变成字符串。
*
* String-->byte[]; str.getBytes(charseName);
* byte[] -->String: new String(byte []);
* */
public class Demo2107
{
    public static void main(String [] args) throws UnsupportedEncodingException
    {
        String s="你好";
        byte [] b1=s.getBytes("GBK");
        String s1=new String(b1,"ISO8859-1");
        //对s1进行iso8859-1编码。
        byte [] b2=s1.getBytes("ISO8859-1");
        System.out.println(Arrays.toString(b2));
        String s2=new String(b2,"GBK");
        System.out.println("s2:"+s2);
        //System.out.println(Arrays.toString(b1));

    }
}
