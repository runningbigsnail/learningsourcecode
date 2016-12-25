package day18;
import java.util.*;
import java.text.*;
/**
 * Created by zhangsanshi on 2016/9/5.
 */
/*
*
*
* */
public class Demo1804_1
{
    public static void main(String [] args)
    {
        /*
       Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        String year=sdf.format(d);
        System.out.println(year);
        */
        Calendar c=Calendar.getInstance();
        String[] mons={"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
        int num=c.get(Calendar.MONTH);
        System.out.println(mons[num]);


    }
}
