package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangsanshi on 2016/9/1.
 */
public class Demo1715
{
    public static void main(String [] args)
    {
    Sort();

    }
    public static void Sort()
    {
        List<String> list=new ArrayList<String>();
        list.add("abcd");
        list.add("hfgh");
        list.add("eaha");
        list.add("zzze");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);



    }
}
