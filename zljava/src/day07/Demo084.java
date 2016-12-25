package day07;

/**
 * Created by zhangsanshi on 2016/8/3.
 */
//将学生和工人的共性描述提取出来，单独进行描述
// 只要让学生和工人与单独描述的这个类有关系就可以了。
/*继承：
1，提高了代码的复用性
* 2，让类与类之间产生了关系。有了这个关系，才有了多态的特性。
* 注意：千万不要为了获取其他类的功能，简化代码而继承
* 必须是类与类之间由所属关系才可以继承，所属关系 is a。
* java语言中，java只支持单继承，不支持多继承
* 因为多继承容易带来安全隐患：当多个父类中定义了相同功能但功能内容不同时，子类对象不确定要运行哪一个。
*
 但是java中保留这种机制。并用另一种体现形式来完成表示，即多实现
 java支持多层继承，也就是一个继承体系
 如何使用一个继承体系中的功能呢？
 想要使用体系，先查阅体系中父类的描述，因为父类中定义的是该体系中的共性功能。
 通过了解共性功能，就可以知道该体系的基本功能。
 那么这个体系已经可以基本使用了。
 那么在具体调用时，要创建最子类的对象，为什么呢？
 1，因为有可能父类不能创建对象
 2,创建子类对象可以使用更多的功能，包括基本的也包括特有的。
 ********简单一句话：查阅父类功能，创建子类对象使用功能。************
 */
    /*
    * class A
    * {
    * void show()
    * {
    * System.out.println("a");
    * }
    * }
    * class B
    * {
    * void show()
    * {
    * System.out.println("b");
    * }
    * }
    * class C extends A,B
    * {
    * C c1=new C();
    * c1.show();//多继承，不知道show哪一个。
    * }
    * */
public class Demo084 {


}
class Person  //父类
{
    String name;
    int age;

}
class student extends Person//子类
{
   void study()
   {
       System.out.println("good Study!");
   }
}
class worker extends Person
{
  void work()
  {
      System.out.println("good work!");

  }
}
class ExtendsDemo
{
    public static void main(String[] args)
    {


    }
}