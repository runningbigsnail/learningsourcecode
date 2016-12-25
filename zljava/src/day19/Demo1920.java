package day19;

import java.io.*;

/**
 * Created by zhangsanshi on 2016/10/2.
 */
public class Demo1920
{
    public static void main(String [] args) throws IOException
    {
        //System.setIn(new FileInputStream("e:\\Demo.txt"));
        System.setOut(new PrintStream("e:\\zzz.txt"));
        BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
        String line=null;
        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
        bufw.close();
    }
}
