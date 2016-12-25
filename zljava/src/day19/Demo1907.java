package day19;

/**
 * Created by zhangsanshi on 2016/9/17.
 */
/*
MyReader//专门用于读取数据的类。
        |--MyTextReader
            |--MyBufferTextReader
        |--MyMediaReader
            |--MyBufferMediaReader
        |--MyDataReader
            |--MyBufferDataReader


class MyBufferReader
{
    MyBufferReader(MyTextReader text)
    {
    }
    MyBufferReader(MyMediaReader media)
    {
    }
}
上面这个类扩展性很差。
找到其参数的共同类型。通过多态的形式，可以提高扩展性。
class MyBufferReader extends MyReader
{
    private MyReader r;
    MyBufferReader(MyReader r)
    {

    }
}
MyReader//专门用于读取数据的类。
        |--MyTextReader
        |--MyMediaReader
        |--MyDataReader
        |--MyBufferReader
装饰模式比继承要灵活，避免了继承体系臃肿。
而且降低了类与类之间的关系。
装饰类因为增强已有对象，具备的功能和已有的是相同的。只不过提供了更强的功能。
所以装饰类和被装饰类通常都是属于一个体系中的。
*/
public class Demo1907
{
    public static void main(String [] args)
    {
        System.out.println("Hello World！");
    }

}
