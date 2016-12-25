package day18;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.DateFormat;
import java.util.Date;
import java.text.*;
/**
 * Created by zhangsanshi on 2016/9/5.
 */
public class Demo1803
{
    public static void main(String [] args)
    {
        Date d=new Date();
        System.out.println(d);//打印的时间看不懂，希望有些格式。
        //将模式封装到SimpleDateformat对象中。
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm");
        //调用format方法让模式格式化指定Date对象。
        String time= sdf.format(d);
        System.out.println("time="+time);

    }
}
