package day17;

import java.util.*;

/**
 * Created by zhangsanshi on 2016/8/31.
 */
/*
*
*
* */
public class Demo1710
{
    public static void main(String [] args)
    {
        //sortDemo();
        //maxDemo();
       // binarySearchDemo();
       // fillDemo();
        replaceAllDemo();
    }
    public static void replaceAllDemo()
    {
        List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("aaaa");
        list.add("kkkkkk");
        list.add("zzzzz");
        list.add("aaaa");
        sop(list);
        Collections.replaceAll(list,"aaaa","ppp");
        sop(list);
    }
    /*
    * 练习.fill方法可以将list集合中所有元素替换成指定元素。
    * 将list集合中部分元素替换成指定元素。
    *
    * */
    public static void fillDemo()
    {
        List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("aaaa");
        list.add("kkkkkk");
        list.add("zzzzz");
        list.add("aaaa");
        sop(list);
        Collections.fill(list,"pp");//将集合中所有元素全部变为pp
        sop(list);


    }
    public static void binarySearchDemo()
    {
        List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("aaaa");
        list.add("kkkkkk");
        list.add("zzzzz");
        list.add("aaaa");
        sop(list);
        Collections.sort(list);
        sop(list);
        int index=Collections.binarySearch(list,"aaaa");
        sop(index);

    }
    public static void sortDemo()
    {
    List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("aaaa");
        list.add("kkkkkk");
        list.add("zzzzz");
        list.add("aaaa");
        sop(list);
        //Collections.sort(list);
        Collections.sort(list,new StrLenComparator());
        sop(list);
    }
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
    public static void maxDemo()
    {
        List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("aaaa");
        list.add("kkkkkk");
        list.add("zzzzz");
        list.add("aaaa");
        sop(list);
        String max=Collections.max(list);
        sop(max);
    }
    /*
    public static <T extends Comparable<? super T>> void sort(List<T> list)
    {

    }
    */
}
class StrLenComparator implements Comparator<String>
{
    public int compare(String s1,String s2)
    {
        if(s1.length()>s2.length())
            return 1;
        if(s1.length()<s2.length())
            return -1;
        return s1.compareTo(s2);
    }
}