package day20;

import java.io.*;

/**
 * Created by zhangsanshi on 2016/10/2.
 */
/*
 File类常见方法。
 1，创建。
boolean createNewFile();在指定位置创建文件，如果该文件已经存在，则不创建，返回false。
 和输出流不一样，输出流对象一建立就会创建文件，而且文件已经存在会覆盖。
    boolean mkdir(); 创建文件夹。
    boolean mkdirs();创建多级文件夹。
 2，删除。
  boolean delete();删除失败返回false。
  void deleteOnExit();在程序退出时删除指定文件。
 3，判断。
   boolean canExecute()；判断是否可执行。
   boolean exists();是否存在，用的频率比较高。
   isFile();是否是文件。
   isDirectory();是否是文件夹
   isHidden();是否隐藏。

4，获取信息。
    getName();
    getPath();
    long lastModify();
 */
public class Demo2001
{
    public  static void main(String [] args) throws IOException
    {
        //consMethod();
        //method_1();
        //method_2();
       // method_3();
        method_4();
    }
    public  static void method_3() throws IOException
    {
        File f=new File("e:\\Demo12.txt");
        //记住在判断文件对象是否是文件或目录时，必须先判断该文件对象封装的内容是否存在。
        //通过exists判断。
        f.mkdir();
       // f.createNewFile();

        sop("dir:"+f.isDirectory());
        sop("file:"+f.isFile());
        sop(f.isAbsolute());//是否为抽象，是否为绝对路径。

    }
    //创建对象
    public static void consMethod()
    {
        //将a.txt文件封装成file对象,可以将已有的和未出现的文件或者文件夹封装成对象。

        File f1=new File("e:\\a.txt");
        File f2=new File("e:\\abc","b.txt");
        File d=new File("e:\\abc");
        File f3=new File(d,"c.txt");
        sop("f1:"+f1);
        sop("f2"+f2);
        sop("f3"+f3);
        File f4=new File("e:"+File.separator+"abc\\zzz\\d.txt");
        //  File.separator可以实现夸平台。

    }
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
    public static void method_1() throws IOException
    {
        File f=new File("e:\\file.txt");
        //sop("create:"+f.createNewFile());
        sop("delete:"+f.delete());

    }
    public static void method_2()
    {
        File f=new File("e:\\Demo.txt");
        //sop("exists:"+f.exists());
        //sop("execute:"+f.canExecute());
        //创建文件夹
        File dir=new File("e:\\abcdr");
        dir.mkdir();//只能创建一级目录。


    }
    public static void method_4()
    {
        File f=new File("e:\\Demo.txt");
        //f.getAbsoluteFile();//获取绝对路径。
       // sop(f.getAbsoluteFile());
       // sop(f.getParent());//该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回null;
        //如果相对路径中有上一层目录那么该目录就是返回结果。
        File f1=new File("e:\\Demo.txt");
        File f2=new File("e:\\fos12.txt");
        sop("rename:"+f2.renameTo(f1));//剪切文件并重命名。
    }

}
