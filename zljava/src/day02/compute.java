package day02;

/**
 * Created by zhanglei on 2016/4/17.
 */
public class compute {
    public static  void main(String[] args){
        //取出60的低四位数字 即用60与15进行与运算
        System.out.println(Integer.toBinaryString(60));
        int num=60;
        int n1=num & 15;
        System.out.println((char)(n1-10+'A'));
       //取60的高四位，将60的二进制右移4位，然后与15进行与运算，以此类推
    int temp=60>>>4;//8进制右移三位
        int n2=temp & 15;
        System.out.println(n2);
        /*0-9 ‘A’ ‘B’'C' 'D' 'E' 'F'
                65    66  67
                10    11   12
                   12-10=2+'A'=(char)67;
                */

    }
}
