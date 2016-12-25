package day05;

/**
 * Created by zhangsanshi on 2016/6/24.
 */
public class demo64 {
    //面向对象的三个特征：封装、继承、多态
//以后开发：找对象使用，没有对象，就创建一个对象。
    //找对象，建立对象，使用对象，维护对象的关系。
/*
* 类和对象的关系：
*类：就是对现实生活中事物的描述
*对象：就是这类事物实实在在存在的个体。
*例：现实生活中的对象：张三，李四
*想要描述：提取对象中共性内容，对具体的抽象
* 描述（用类的形式来体现）时：这些对象的共性有姓名，年龄，性别，学习java的功能。
*映射到java中就是class定义的类
* 具体对象就是对应java在堆内存中用new建立的实体。
 *  */
//需求：描述汽车,描述事物其实就是在描述事物的属性和行为。
    //属性对应类中的变量。行为对应类中的函数（方法）。
    //其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）。
/*
    //成员内部类不能含有static的变量和方法
    class CarDemo{
         public  static void main(String[] args){       //生产汽车。在java中通过new操作符来完成。
               //其实就是在堆内存中产生一个实体。
                Car c= new Car();//c就是一个类类型变量。
         }
    }
    */

    public static void main(String[] args) {
        // CarDemo cd = new CarDemo();
        //  cd.ss();
    }
}
//内部类中有静态主函数入口，则该类也应该定义为静态类。
    class CarDemo {
       public static void main(String[] args)
       {
           //生产汽车。在java中通过new操作符来完成。
           //其实就是在堆内存中产生一个实体。
           Car c = new Car();//c就是一个类类型变量。
           c.color="蓝色";//改变颜色
           /* new Car().color="蓝色"; //匿名对象
           * 简写为
           * */
           new Car().color="蓝色"; //匿名对象 使用方式1 当对对象的方法只调用一次时可以用匿名对象来完成，这样写比较简化
           //如果对一个对象进行多个成员调用，必须给这个对象起一个名字。
           //使用方式2 可以将匿名对象作为实际 参数进行传递。
           //调用方法
           Car q= new Car();
            show(q);
       //以上两句可以简写为 show（new Car()）;
       }
    public static void show(Car c)
    {
        c.num = 3;
        c.color = "black";
    }
                        }


//成员变量和局部变量区别
//作用范围：
//成员变量作用于整个类中，而局部变量作用于函数中或语句中。
//在内存中的位置
//成员变量:在堆内存中，因为对象的存在，才在内存中存在。
//局部变量：存在栈内存中。比如c即为一个局部变量（其写在主函数中）。
class Car {
    //描述颜色
    String color="红色";//成员变量
    //描述轮胎数
    int num=4;//成员变量
    //运行行为。
    void run()
    {
        System.out.println(color+".."+num);
    }
}

 class CarDemotest {
     public static void main(String[] args) {
         //生产汽车。在java中通过new操作符来完成。
         //其实就是在堆内存中产生一个实体。
         Car c = new Car();//c就是一个类类型变量。
         c.color = "蓝色";//改变颜色
     }
 }
