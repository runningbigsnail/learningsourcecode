package day19;

/**
 * Created by zhangsanshi on 2016/9/13.
 */
/*
* 装饰设计模式：
* 当想要对已有的对象进行功能增强时。
* 可以定义类，将已有对象传入，基于已有的功能并提供加强功能。
* 那么自定义的该类就称为装饰类。
*装饰类通常会通过构造方法接收被装饰的对象。
* 并给予被装饰的对象的功能，提供更强的功能。
*
* */
class Person
{
    public void chifan()
    {
        System.out.println("吃饭");
    }
}
class SuperPerson
{
    private Person p;
    SuperPerson(Person P)
    {
        this.p=p;
    }
    public void superChifan()
    {
        System.out.println("开胃酒");
        p.chifan();
        System.out.println("甜点");
        System.out.println("来一根");
    }

}
public class Demo1906
{
    public static void main(String [] args)
    {
        System.out.println("Hello World!");
    }
}
