package day18;

/**
 * Created by zhangsanshi on 2016/9/5.
 */
/*
该类中并没有提供构造函数。
说明不可以new对象。那么回直接想到该类中的方法都是静态的
发现该类中含有非静态方法。
说明该类中肯定会提供方法获取本类对象。而且该方法是静态的。并返回值类型是基本类类型。
该方法是static Runtime getRuntime();
由这个特点可以看出，该类使用了单例设计模式完成。
*/

public class Demo1802
{
    public static void main(String [] args) throws Exception
    {
        Runtime r=Runtime.getRuntime();
        r.exec("c:\\min.exe");
        /*杀掉子进程。
        Process p=r.exec("min.exe");
        Thread.sleep(4000);
        p.destroy();
        */
    }
}
