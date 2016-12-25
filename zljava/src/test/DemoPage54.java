package test;

/**
 * Created by zhangsanshi on 2016/12/25.
 */
public class DemoPage54
{
    public static void main(String [] args)
    {

        StringBuilder strb=new StringBuilder();
        String a="lisi";
        strb.append("zhangsan");
        strb.append(a);
        int c=strb.length();
        strb.setCharAt(3,'b');
        String b=strb.toString();
        System.out.println("字符串内容:"+b+"\n"+"代码单元数量:"+c);
        StringBuilder strb2=strb.insert(3,"hahahaha");
        System.out.println("insert以后的字符串："+strb2.toString());
       //或者 String strb2=strb.insert(3,"hahaha").toString();

       // System.out.println("insert以后的字符串:"+strb2);



    }



}
