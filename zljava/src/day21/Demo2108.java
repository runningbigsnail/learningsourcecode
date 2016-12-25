package day21;

import java.io.UnsupportedEncodingException;

/**
 * Created by zhangsanshi on 2016/10/6.
 */
public class Demo2108
{
    public static void main(String [] args) throws UnsupportedEncodingException
    {
        String s="联通";
        byte [] by=s.getBytes("gbk");
        for(byte b: by)
        {
            System.out.println(Integer.toBinaryString(b&255));
        }
        System.out.println("Hello World!!");
    }
}
