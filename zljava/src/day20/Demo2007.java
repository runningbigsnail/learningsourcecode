package day20;
import java.io.*;
/**
 * Created by zhangsanshi on 2016/10/3.
 */
/*
* 列出指定目录下文件或者文件夹，包含子目录中的内容。
* 也就是列出制定目录下所有内容。
*
* 因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可。
* 在列出过程中出现的还是目录的话，还可以再次调用本功能。
* 也就是函数自身调用自身。
* 这种表现形式，或者编程手法，成为递归。
*
* 递归要注意：
* 1，限定条件。
* 2，要注意递归的次数避免内存溢出。
*
* */
public class Demo2007
{
    public static void main(String [] args)
    {
        File dir=new File("e:\\javaceshi");
        showDir(dir,0);
        //toBin(6);
    }
    public static void toBin(int num)
    {
        if(num>0)
        {
            toBin(num/2);
            System.out.println(num%2);
        }
    }
    public static void showDir(File dir,int level)
    {
        System.out.println(getLevel(level)+dir.getName());
        level++;
        File [] files=dir.listFiles();
        for(int x=0;x<files.length;x++)
        {
            if(files[x].isDirectory())
                showDir(files[x],level);
            else
            System.out.println(getLevel(level)+files[x]);
        }
    }
    public static String  getLevel(int level)
    {
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<level;x++)
        {
            sb.append("!-- ");

        }
        return sb.toString();
    }
}
