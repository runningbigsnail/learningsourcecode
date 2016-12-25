package day20;

/**
 * Created by zhangsanshi on 2016/10/4.
 */
import java.io.*;
/*
    删除一个带内容的目录。
    删除原理：
    在windows中删除目录是从里面往外删除的。
    既然是从里往外删除，就需要用到递归。
 */
public class Demo2009
{
    public static void main(String [] args)
    {
        File dir=new File("e:\\javaceshi");
        removeDir(dir);

    }
    public static void removeDir(File dir)
    {
        File[] files=dir.listFiles();
        for(int x=0;x<files.length;x++)
        {
            if(!files[x].isHidden()&&files[x].isDirectory())
                removeDir(files[x]);
            else
                System.out.println(files[x].toString()+":file:"+files[x].delete());
        }
        System.out.println(dir.toString()+":dir:"+dir.delete());

    }

}
