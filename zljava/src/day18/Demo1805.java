package day18;

import java.util.Random;

/**
 * Created by zhangsanshi on 2016/9/6.
 */
/*
*
*
* */
public class Demo1805
{
    public static void main(String [] args)
    {
        Random r=new Random();
        for(int x=0;x<10;x++)
        {
            //double d4=Math.random();//0~`1之间伪随机数。伪：算法算出来的。
           // int d5=(int)(Math.random()*10+1);
            int d6=r.nextInt(10)+1;//0~`10之间随机数。
            System.out.println(d6);
        }

    }
    public static void show()
    {
        double d=Math.ceil(16.34);//ceil返回大于指定数据的最小整数。
        double d1=Math.floor(12.34);//返回小于指定数据的最大整数。
        long d2=Math.round(12.34);//四舍五入
        System.out.println(d);
        System.out.println(d2);
        double d3=Math.pow(2,3);
        System.out.println((int)d3);
    }
}
