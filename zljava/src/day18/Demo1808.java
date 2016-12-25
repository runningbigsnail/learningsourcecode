package day18;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/7.
 */
/*
* IO异常的处理方式。
*
* */
public class Demo1808
{
    public static void main(String [] args)
    {
        FileWriter fw=null;
        try
        {
             fw=new FileWriter("e:\\demo.txt");
            fw.write("abcdefg");

        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            try
            {
             if(fw!=null)
            fw.close();
            }
           catch(IOException e)
           {
               System.out.println(e.toString());
           }
        }

    }

}
