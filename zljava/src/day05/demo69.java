package day05;

/**
 * Created by zhangsanshi on 2016/7/14.
 */
public class demo69 {
    private String name;
    private int age;
    /*
    * 构造代码块，
    * 作用：给对象进行初始化
    * 对象一建立就运行，而且优先于构造函数执行
    * 和构造函数的区别，构造代码块是给所有对象进行统一初始化
    * 而构造函数是给对应的对象初始化
    * */
    //this看上去用于区分局部变量和成员变量重名
    //this代表它所在函数所属对象的引用。
    //简单的说，哪个对象在调用this所在的函数，this就代表哪个对象。
    //this的应用，当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。

    {
        System.out.println("欢迎！！！");


    }
    demo69()
    {
        System.out.println("c:name="+name+",,age="+age);
    }
    demo69(int age)
    {
        this.age=age;

    }
    demo69(String name,int age)
    {
       // this.name=name;
        this(name);// p这个对象的name初始化，调用了demo69(String name)
        this.age=age;
        System.out.println("c:name="+name+",,age="+age);

    }
    demo69(String name)
    {
         this.name=name;
        System.out.println("c:name="+name+",,age="+age);

    }
    //需求，给人定义一个用于比较年龄是否相同的功能，也就是是否是同龄人。
    public boolean compare(demo69 p)
    {
    return this.age==p.age;


    }
    //功能 this用于构造函数间的进行互相调用
    //函数间互相调用时，this语句只能放在构造函数的第一行
}

class persongDemo
{
    public  static  void main(String [] args)
    {
      //  demo69 d =new demo69();//构造函数对象一建立就会调用与之对应的构造函数
        //构造函数的作用：可以用于给对象进行初始化。
        //当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数
        //demo69 d2=new demo69("LIsi");
        //demo69 d3=new demo69("LIsi",15);
        demo69 d4=new demo69(20);
        demo69 d5=new demo69(25);
        boolean b=d4.compare(d5);
        System.out.println(b);
        demo69 d6=new demo69("lisi",20);
        }


}
