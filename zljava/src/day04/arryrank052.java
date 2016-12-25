package day04;

/**
 * Created by zhangsanshi on 2016/5/12.
 */
public class arryrank052 {
    //冒泡排序：相邻的两个元素进行比较，如果满足条件就换位
   //提示;第一次比较后，最先确定数组的最后一个值
    public  static  void main(String args[]){
        int [] arr=new int[]{12,4,2,7,8,11};
        maopao(arr);
        printarray(arr);
        }

    public  static  void printarray(int [] arr){
        System.out.print("从小到大排序后的数组为");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+",");


        }

    }

     public static  void maopao(int [] a){

         for (int x=0;x<a.length-1;x++){
             for(int y=0;y<a.length-x-1;y++){  //-1防止数组访问越界
                 if(a[y]>a[y+1])
                 {
                    int temp=a[y];
                     a[y]=a[y+1];
                     a[y+1]=temp;
                 }

             }





         }

         }



}
