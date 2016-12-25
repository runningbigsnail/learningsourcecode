package day03;

/**
 * Created by zhanglei on 2016/4/24.
 */
public class a99chenfabiao {
    /*
    1*1=1
    1*2=2 2*2=4
    1*3=3 2*3=6 3*3=9
     */
    public  static  void main(String [] args){
        for (int x=1;x<=3;x++)
        {
            for(int y=1;y<=x;y++)
            {
            System.out.print(y+"*"+x+"="+x*y+" ");
            }
             System.out.println();


        }

/*
对于99乘法表，外部循环控制行数
内部循环控制列数


*/

    }
}
