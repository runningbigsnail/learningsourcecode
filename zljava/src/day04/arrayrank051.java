package day04;

/**
 * Created by zhangsanshi on 2016/5/12.
 */
public class arrayrank051 {
    //选择排序法
    //思路，先将后面所有元素和零角标元素比较，然后再将第二个元素（1角标元素）和后边的元素比较
    //从左到右依次比较
    // 注意，调用rankarr时，arr和a会指向同一个数组，对a操作，那么arr指向的数组也会变化，所以rankarr函数没有返回值，故返回值类型void
    public  static  void main(String args[]){
        int [] arr=new int[] {4,2,8,7,10,3,5};
        rankarr(arr);
        printarray(arr);

    }
    public  static  void printarray(int [] arr){
        System.out.print("从小到大排序后的数组为");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+",");


        }

    }
    public static void rankarr(int [] a){
          for (int x=0;x<a.length-1;x++){
            for (int y=x+1;y<a.length;y++){
                if (a[x]>a[y]){
                    //互换位置
                    int temp=a[x];
                      a[x]=a[y];
                   a[y]=temp;
                }



            }

        }


        }
}
