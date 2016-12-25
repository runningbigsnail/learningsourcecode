package day07;

/**
 * Created by zhangsanshi on 2016/8/4.
 */
//3，子父类中的构造函数
/*子类的实例化过程。
      在对子类对象进行初始化时，父类的构造函数也会运行，那是因为子类的构造函数默认第一行有一条隐式的语句叫做super
       super（）；会访问父类中空参数的构造函数，并且子类中所有的构造函数默认第一行都是super（）；
   为什么子类一定要访问父类中的构造函数。
    因为父类中的数据子类可以直接获取，所以子类对象在建立时需要先查看父类是如何对这些数据进行初始化的。
    所以子类在对象初始化是，要先访问一下父类的构造函数。
              如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式来指定

     注意：super语句一定定义在子类构造函数的第一行。
     结论：子类所有的构造函数默认都会访问父类中空参数的构造函数，因为子类每一个构造函数内都有一句隐式的super（）；
     当父类中没有空参数的构造函数时，子类必须手动通过super或者this语句形式来指定要访问父类中的的构造函数。
     当然，子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。子类中至少有一个构造函数要访问父类构造函数。
     */
public class Demo088 {
}
class Fu //extends object （object为所有类的父类  ）
{
    Fu()//默认构造函数为空参数的。
    {
        System.out.println("Fu run!!");
    }
    Fu(int x)//super不会掉用该方法
    {
        System.out.println("zi run!!");
    }

}
class Zi extends Fu
{
    Zi()
    {
        //super();
        super(4);
        System.out.println("Zi run!!");

    }
    Zi(int x)
    {
        //super();
        System.out.println("zi..."+x);
    }
}
class ExtendDemo4
{
    public static void main(String[] args)
    {
        Zi z=new Zi();
        Zi z1=new Zi(4);

    }


}
class Person1
{
    private String name="zhangsan";
    void show(){
        System.out.println(this.name);
    }
    Person1(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }

}
class Student extends  Person1
{
    Student(String name)
    {
     super(name);//调用的是父类的构造函数Person1；


    }
   void method()
   {
       super.show();
   }

}
class ExtendDemo5
{
    public static void main(String[] args) {
        Student z = new Student("lisi");
    }
}