package day17;

import java.util.Arrays;
import static java.util.Arrays.*;//导入的是Arrays这个类中的所有静态成员
import static java.lang.System.*;//导入了System类中所有静态成员。
/**
 * Created by zhangsanshi on 2016/9/3.
 */
/*
* 1.5版本新特性。
*StaticImport 静态导入
* 当类名重名时，需要制定具体的包名
* 当方法重名时，要制定具体所属的对象或者类。
* 静态导入导入的是某一个类中的所有静态成员。
* */
public class Demo1720   extends Object
{
    public static void main(String [] args)
    {
        int [] arr={3,12,5};
        //Arrays.sort(arr);
        sort(arr);
        //int index=Arrays.binarySearch(arr,5);
        int index=binarySearch(arr,5);
        //System.out.println(Arrays.toString(arr));//Object中也有toString方法。故该Arrays不可以省略
       // System.out.println("Index:"+index);
        out.println(Arrays.toString(arr));
        System.out.println("Index:"+index);
    }
}
