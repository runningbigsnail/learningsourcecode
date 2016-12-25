package day22;

import java.awt.*;

/**
 * Created by zhangsanshi on 2016/10/7.
 */
public class Demo2204
{
    public static  void main(String [] args)
    {

        Frame f=new Frame("我的");
        f.setSize(500,400);

        f.setLocation(300,200);
        f.setLayout(new FlowLayout());
        Button b=new Button("一个按钮");
        f.add(b);

        // System.out.println("Hello World");
        f.setVisible(true);


    }



}
