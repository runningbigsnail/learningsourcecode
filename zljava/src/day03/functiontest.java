package day03;

/**
 * Created by zhangsanshi on 2016/5/6.
 */
public class functiontest {
    /*
    * 修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2）
    * 执行语句；
    * return 返回值；
    *
    * */
    public static  int getResult(int num)
    {
        return num*3+5;
    }
    public static void main(String args[])
    {
        int x=getResult(4);
     System.out.println("x="+x);
    }
}
