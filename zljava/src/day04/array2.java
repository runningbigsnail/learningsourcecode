package day04;

/**
 * Created by zhangsanshi on 2016/5/10.
 */
public class array2 {
    public static void main(String args[]) {
        //定义方式1
        //int [] arr=new int[2];
        //定义方式2
        // int arr[]=new int[2];
        //定义方式3
        int[] arr = new int[]{1, 3, 4, 5};
        arr[1]=55;
        System.out.println(arr[1]);
        //arr=null;
        //假如给arr赋值为null则它不再指向数组，变成了一个空指针
    }
}
