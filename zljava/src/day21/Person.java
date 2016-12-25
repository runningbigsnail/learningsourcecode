package day21;

import java.io.Serializable;

/**
 * Created by zhangsanshi on 2016/10/5.
 */
public class Person implements Serializable
{
    public static final long serialVersionUID=42L;
    private String name;
    transient int age;//加上transient就不能被序列化了。
    static String country="cn";//静态的不能序列化。
    Person(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }



    public String toString()
    {
        return name+"::"+age+"::"+country;
    }
}
