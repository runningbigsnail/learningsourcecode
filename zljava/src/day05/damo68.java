package day05;

/**
 * Created by zhangsanshi on 2016/7/13.
 */
public class damo68
{    /*
private:私有，权限修饰符，用于修饰类中的成员（成员变量，成员函数）
私有只在本类中有效。
私有仅仅是封装的一种表现形式。
*/
    private int age;
    public void setAge(int a)//setAge 第一个单词首字母小写，之后的单词首字母大写
   //之所以对外提供访问方式，就因为可以在访问方式中加入逻辑判断等语句。
           // 对访问的数据进行操作。提高代码的健壮性。
    {
        if(a>0&&a<130)
        age=a;
       else
            System.out.println("非法格式");

    }
    public int getAge()//返回int类型的值
    {
        return age;
    }
    void speak()
    {
    System.out.println("age="+age);

    }
}
class persondemo
{
public  static  void main(String [] args)
{
       damo68 p=new damo68();
      p.setAge(20);
       p.speak();

}



}