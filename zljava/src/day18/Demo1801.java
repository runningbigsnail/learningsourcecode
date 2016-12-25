package day18;

import java.util.Properties;

/**
 * Created by zhangsanshi on 2016/9/5.
 */

/*
* System:类中的方法和属性都是静态的。
* out：标准输出，默认是控制台。
* in：标准输入，默认是键盘
*
* 描述系统一些信息
* 获取系统属性信息：Properties getProperties();
*
* */
public class Demo1801
{
    public static void main(String [] args)
    {
        Properties pop=System.getProperties();
        //因为Properties是Hashtable的子类，也就是Map集合的一个子类对象。
        //那么可以通过map的方法取出该集合中的元素。
        //该集合中存储的都是字符串，没有泛型定义。
        //如何在系统中自定义一些特有信息？
        System.setProperty("mykey","myvalue");
        /*
        //获取所有属性信息。
        for(Object obj:pop.keySet())
        {
            String value=(String)pop.get(obj);
            System.out.println(value);
        }
        */
        //获取指定属性信息。
        String value=System.getProperty("os.name");
        System.out.println("value="+value);
        //可不可以在jvm启动时，动态加载一些属性信息呢？

    }
}
