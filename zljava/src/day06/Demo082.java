package day06;

/**
 * Created by zhangsanshi on 2016/8/2.
 */
/*
* 设计模式：（偏思想）解决某一类问题最行之有效的方法
* java中23中设计模式；
* 单例设计模式：解决一个类在内存中只存在一个对象。
* 想要保证对象唯一
* 1，为了避免其他程序过多建立该类对象，先控制禁止其他程序建立该类对象。
*2，还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
* 3，为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式.
* 这三部怎么用代码体现呢?
* 1,将构造函数私有化.
* 2,在类中创建一个本类对象.
* 3提供一个方法可以获取到该对象。
* 对于事物该怎么描述还怎么描述。
* 当需要将该事物的对象保证在内存中唯一是，就将以上的三步加上即可
* */
class Demo082 {
    private int num;
    public void setNum(int num)
    {
    this.num=num;
    }
    public int getNum()
    {
        return num;
    }
    private  Demo082(){}//私有化该构造函数导致外部无法创建对象
   private static Demo082 d=new Demo082();
    public static Demo082 getInstance()
    {
        return d;

    }

}
class SingleDemo
{
    public static  void main(String[] args)
    {
        Demo082 S=Demo082.getInstance();
        Demo082 S2=Demo082.getInstance();
        S.setNum(30);
        System.out.println(S2.getNum());

    }


}
