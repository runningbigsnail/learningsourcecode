package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/7.
 */
public class Demo1812
{
    public static void main(String [] args) throws IOException {
        FileReader fr=new FileReader("e:\\demo.java");
        char[] buf=new char[1024];
        int num=0;
        while ((num=fr.read(buf))!=-1)
        {
            System.out.println(new String(buf,0,num));
        }
        fr.close();
    }
}
