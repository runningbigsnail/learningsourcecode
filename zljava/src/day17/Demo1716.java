package day17;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangsanshi on 2016/9/1.
 */
//Arrays:用于操作数组的工具类
    //里面都是静态方法
    /*asList将数组变成list集合
     */
public class Demo1716
{
    public static void main(String [] args)
    {
       // int [] arr={2,4,5};
        //System.out.println(Arrays.toString(arr));
        String [] arr={"abc","cc","kkk"};
        List<String> list=Arrays.asList(arr);
        System.out.println(list);
        /*
        * 把数组变成list集合有什么好处？
        * 可以使用集合的思想和方法来操作数组中的元素。
        * 注意：将数组变成集合，不可以使用集合的增删方法，因为数组的长度是固定的。
        * contains
        * get
        * indexof();
        * 如果增删，会发生异常。
        * */
       // int [] nums={2,4,5};
        Integer [] nums={2,4,5};
       List<Integer> li= Arrays.asList(nums);
        /*
        * 如果数组中的元素都是对象。那么变成集合
        * 时，数组中的元素就直接转成集合中的元素。
        *如果数组中的元素都是基本数据类型，那么
        * 会将该数组作为集合中的元素存在。
        * */
        System.out.println(li);

    }
}
