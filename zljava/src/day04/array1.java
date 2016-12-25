package day04;

/**
 * Created by zhangsanshi on 2016/5/7.
 */
public class array1 {
    //元素类型[] 数组名= new 元素类型[元素个数或数组长度]
    public static  void main(String args[]){
        int [] x=new int[3];
        //只要有new出现，就会在堆中开辟一块新的空间
        //而x在栈中
        System.out.println(x[0]);
     //打印数组中角标为0的数组元素
    }

}
