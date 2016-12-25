package day17;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by zhangsanshi on 2016/9/1.
 */
public class Demo1714
{
    public static void main(String [] args)
    {
        orderDemo();
    }
    public static void orderDemo()
    {
        //TreeSet<String> ts=new TreeSet<String>(new StrComparator());
        TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
        ts.add("abcdef");
        ts.add("aaaa");
        ts.add("ccc");
        ts.add("kkk");
        Iterator it=ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
 class StrComparator implements Comparator<String>
 {
     public int compare(String s1,String s2)
     {
         /*
        int num=s1.compareTo(s2);
         if(num>0)
             return -1;
         if(num<0)
             return 1;
         return num;
         */
         return  s2.compareTo(s1);
     }
 }
