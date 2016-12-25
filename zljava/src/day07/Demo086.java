package day07;

/**
 * Created by zhangsanshi on 2016/8/3.
 */
/*
类中成员：
1，变量
2，函数
3构造函数
1，变量
如果子类中出现非私有的同名成员变量时，子类要访问本类中的变量，用this
子类要访问父类中的同名变量用super
super的使用和this的使用几乎一致，this代表本类对象的引用，super代表父类对象的引用。
2,方法
当子类继承父类，沿袭了父类的功能到子类中，
但是子类虽具备该功能，但是功能的内容却和父类不一致，这时没有
必要定义新的功能，而是使用覆盖特性保留父类的功能定义，并重写功能内容。
（重写）覆盖：
1，子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则编译失败。
2，静态只能覆盖静态（public权限最大其次默认权限 最小private）
重载：只看函数的参数列表
重写：子父类方法要一模一样。
3，子父类中的构造函数
在对子类对象进行初始化时，父类的构造函数也会运行，那是因为子类的构造函数默认第一行有一条隐式的语句叫做super
super（）；会访问父类中空参数的构造函数，并且子类中所有的构造函数默认第一行都是super（）；
*/
public class Demo086 {
}
class Father
{
    int num1 = 4;
    int num3 = 10;

    void show()
    {
        System.out.println(num3);
    }
    void speak()
    {
        System.out.println("vb");

    }
}
class Son extends Father
{
int num2=5;
    int num3=11;
    void show()
    {
        System.out.println(super.num3);//super代表父类//可用this表示子类（this本类），可以省略
    }
   void  speak()
   {
   System.out.println("java");
   }

}
class ExtendsDemo2
{
 public static void main(String []args)
 {
     Son s2=new Son();
     System.out.println(s2.num1+":"+s2.num3);
     s2.show();//当存在同名方法，调用时执行子类的方法。称之为重写（覆盖）

 }

}
class Tel
{
    void show()
    {
        System.out.println("number");

    }

}
class NewTel extends Tel
{
    void show()
    {
    //System.out.println("number");
        super.show();
    System.out.println("name");
    System.out.println("picture");
    }
}