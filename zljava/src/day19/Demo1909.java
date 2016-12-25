package day19;


import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by zhangsanshi on 2016/9/22.
 */
/*
*
*
* */
public class Demo1909
{
    public static void main(String [] args) throws IOException
    {
        FileReader fr=new FileReader("e:\\demo.txt");
        LineNumberReader lnr=new LineNumberReader(fr);
        String line=null;
        while((line=lnr.readLine())!=null)
        {
            //System.out.println(line);
            System.out.println(lnr.getLineNumber()+"..."+line);
        }
        lnr.close();


    }

}
//练习：模拟一个带行号的缓冲区对象。
