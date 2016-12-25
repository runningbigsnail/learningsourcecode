package day06;
/*
* 静态：static
* 用法：是一个修饰符，用于修饰成员（成员变量，成员函数）
* 当成员被静态修饰后，就多了一种调用方式，除了可以被对象调用外，还可以直接被类名调用，写法格式类名.静态成员
* */
/**
 * Created by zhangsanshi on 2016/8/1.
 */
public class demo074 {



}
 class person{
     String name;
    static String country="CN";
     public void show()
     {
         System.out.println(name+":"+country);

     }


 }
class staticDemo
{
    public static void main(String []args)
    {
    // person p=new person();
     //   p.name="zhangsan";
     //   p.show();
    System.out.println(person.country);

    }



}
