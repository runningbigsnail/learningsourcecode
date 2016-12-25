package day18;

import java.util.Calendar;

/**
 * Created by zhangsanshi on 2016/9/5.
 */
/*
* 练习：
* 1，获取任意年的二月有多少天。
* 思路：根据制定年设置一个时间 c.set(year,2,1);//某一年的三月一日
* c.add(Callendar.DAY_OF_MONTH,-1);//3月1日，往前推一天，就是2月最后一天。
* 2，获取昨天的现在这个时刻。
* //c.add(Callendar.DAY_OF_MONTH,-1);
*
*
* */
public class Demo1804_02
{
    public static void main(String [] args)
    {
        Calendar c=Calendar.getInstance();
        //c.set(1992,02,11);
        c.add(Calendar.MONTH,2);//往后推两个月。
       printCalendar(c);
    }
    public static  void printCalendar(Calendar c)
    {
        String[] mons={"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
        int num=c.get(Calendar.MONTH);
        System.out.println(mons[num]);
    }
}
