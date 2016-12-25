package day03;

/**
 * Created by zhangsanshi on 2016/5/7.
 */
/*
* 什么时候重载？
* 当定义的功能相同，但参与运算的未知内容不同。那么，这时就定义一个
* 函数名称以表示其功能，方便阅读，而通过参数列表的不同来区分多个同名函数；
*
*
* */
public class functionpractive
{
    public static int add(int a ,int b)
    {
        return a+b;
    }
    public static int add(int a ,int b,int c)
    {

        return a+b+c;
    }
    //还可以这样重载
    /*
    public static int add(int a,int b,int c){

        return add(a,b)+c;

    }
    */
    public static void main(String args [])
    {

        int x=add(4,5);
        int y=add(4,5,6);
        System.out.println("x="+x+"y="+y);
        //重载的实现

    }

}
