package day18;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zhangsanshi on 2016/9/7.
 */
/*
* 演示对已有文件的数据续写。
*
* */
public class Demo1809
{
    public static void main(String [] args) throws IOException
    {
        //传递一个true参数，代表不覆盖已有的文件。并在已有文件的末尾处进行数据读写。
        FileWriter fw=new FileWriter("e:\\demo.txt",true);
        fw.write("ha\n\rha2");
        fw.close();
    }
}
