package day06;

/**
 * Created by zhangsanshi on 2016/8/3.
 */
/*
* 单例设计模式方式二
*
* */
    /*
public class Demo083 {
    //这个是先初始化对象
    //成为：饿汉式  开发一般用它，更安全
    //Demo083类一进内存就进行初始化
     private static Demo083 s=new Demo083();
    private Demo083(){}
    public static Demo083 getInsatance()
    {
        return s;
    }

}
*/
public class Demo083 {
    //
    //成为：懒汉式
    //Demo082类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象

    private static Demo083 s=null;
    private Demo083(){}
    public static Demo083 getInsatance()
    {
        if(s==null)
            s=new Demo083();
        return s;
    }

}
class Demomode2
{
    public static void main(String[] args)
    {
        Demo083 s2=Demo083.getInsatance();
        System.out.println("Hello World!!");

    }



}
