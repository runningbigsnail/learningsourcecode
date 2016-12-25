package day20;
import java.io.*;
/**
 * Created by zhangsanshi on 2016/10/3.
 */
public class Demo2004
{
    public static void main(String [] args)
    {
       File dir=new File("c:\\");
        File [] files=dir.listFiles();
        for(File f:files)
        {
            System.out.println(f.getName()+"::"+f.length());
        }
    }
    public static void listDemo_2()
    {
        //listRootsDemo();
        // listDemo();
        File dir=new File("e:\\");
        String [] arr=dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name)
            {
                /*
                if(name.endsWith(".java"))
                return true;
                else
                return false;
                */
                return name.endsWith(".txt");
            }
        });
        for(String name: arr)
        {
            System.out.println(name);
        }

    }
    public static void listRootsDemo()
    {
        File[] files=File.listRoots();
        for(File f:files)
        {
            System.out.println(f);
        }
    }
    public static void listDemo()
    {
        File f=new File("c:\\");
        String[] names=f.list();//调用list方法的file对象必须是封装了一个目录。该目录必须是存在的。
        for(String name : names)
        {
            System.out.println(name);
        }
    }
}
