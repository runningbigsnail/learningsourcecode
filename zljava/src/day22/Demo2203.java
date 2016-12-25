package day22;
import javax.swing.*;
import java.awt.*;
/**
 * Created by zhangsanshi on 2016/10/7.
 */
/*
* 创建图形化界面
* 1，创建frame窗体
* 2，对窗体进行基本设置。
* 比如大小，位置，布局。
* 3，定义组件。
* 4，将组件通过窗体的add方法添加到窗体中。
* 5，让窗体显示，通过setVisible(true);显示出来。
*
*
* */
public class Demo2203
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
