package day20;
import java.io.*;
import java.util.*;
/**
 * Created by zhangsanshi on 2016/10/5.
 */
public class Demo2017
{
    public static void main(String [] args) throws IOException {
        //splitFile();
        merge();
    }
    public static void splitFile() throws IOException
    {
        FileInputStream fis=new FileInputStream("e:\\2.jpg");
        FileOutputStream fos=null;
        byte [] buf=new byte[1024*1024];
        int len=0;
        int count=1;
        while((len=fis.read(buf))!=-1)
        {
            fos=new FileOutputStream("e:\\splitFile\\"+(count++)+".part");
            fos.write(buf,0,len);
            fos.close();
        }
        fis.close();

    }
    public static void merge() throws IOException {
        ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
        for(int x=1;x<=2;x++)
        {
            al.add(new FileInputStream("e:\\splitFile\\"+x+".part"));
        }
        final Iterator<FileInputStream> it=al.iterator();
        Enumeration<FileInputStream> en=new Enumeration<FileInputStream>()
        {
            public boolean hasMoreElements()
            {
                return it.hasNext();
            }
            public FileInputStream nextElement()
            {
                return it.next();

            }
        };
        SequenceInputStream sis=new SequenceInputStream(en);
        FileOutputStream fos=new FileOutputStream("e:\\0.jpg");
        byte [] buf=new byte[1024*1024];
        int len=0;
        while ((len=sis.read(buf))!=-1)
        {
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();





    }
}
