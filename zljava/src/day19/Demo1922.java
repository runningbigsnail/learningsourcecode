package day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

/**
 * Created by zhangsanshi on 2016/10/2.
 */
public class Demo1922
{
    public static void main(String [] args) throws FileNotFoundException {
        Properties prop=System.getProperties();
       // System.out.println(prop);

        prop.list(new PrintStream("e:\\sysinfo.txt"));

    }


}
