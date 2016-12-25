package day03;

/**
 * Created by zhangsanshi on 2016/5/6.
 */

public class functiontest2 {
    /*
    public static  void getResult(int num)
    {
        //void表示没有返回值,此时，函数中的return语句可以省略不写
      System.out.println(num*3+5);

    }
   */
    public static  boolean compare(int a,int b)
    {
        if(a==b)
            return true;
        else
            return  false;
        //或者用三元运算符
        // （a==b）?true:false;
        //或者写 return a==b;
    }
    public static void main(String args[])
    {
        boolean x=compare(4,4);
        System.out.println("x="+x);
    }


}
