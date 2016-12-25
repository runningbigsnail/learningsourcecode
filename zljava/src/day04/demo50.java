package day04;

/**
 * Created by zhangsanshi on 2016/5/11.
 */
public class demo50 {

    //获取数组中的最大值
    public  static  void  main(String args []){
        //第一种方法用if语句
       /*
        int [] arr=new int[] {12,4,2,5,8,11};

         int maxtemp=arr[0],a=0;
        for (int x=1;x<arr.length;x++){

            if (arr[x]>maxtemp)
                maxtemp=arr[x];
        }

     System.out.println("最大值为"+maxtemp);
     System.out.println("a的值为"+a);*/
        int [] arr=new int[] {4,2,5,8,13,11};
         int max=getmax(arr);
        System.out.println("最大值为"+max);
    }
    //写成一个函数
    public  static  int getmax(int [] arr){
        int maxtemp=arr[0];
        for (int x=1;x<arr.length;x++){

            if (arr[x]>maxtemp)
                maxtemp=arr[x];
        }
       return maxtemp;
    }

}
