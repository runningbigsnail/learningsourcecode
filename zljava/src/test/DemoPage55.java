package test;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by zhangsanshi on 2016/12/25.
 */
public class DemoPage55 {
    public static void main(String[] args) {
        //nextLineDemo();
        nextDemo();

    }

    public static void nextDemo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请用键盘输入：");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("str1:"+str1+"\n"+"str2:"+str2);


    }


    public static void nextLineDemo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What's your name ?");
        String name=sc.nextLine();
        System.out.println("how old are you ?");
        int age=sc.nextInt();
        System.out.println("name:"+name+"\n"+"age:"+age);




    }


}
