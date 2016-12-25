package day19;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhangsanshi on 2016/9/23.
 */
public class Demo1914
{

}
class MyBufferedInputStream
{
    private InputStream in;
    private byte[] buf=new byte[1024];
    private int pos=0,count=0;
    MyBufferedInputStream(InputStream in)
    {
        this.in=in;
    }
    //一次读一个字节，从缓冲区（字节数组）获取。
    public int myRead() throws IOException
    {
        //通过in对象读取硬盘上数据，并存储到buf中。
        if(count==0)
        {
            count=in.read(buf);
            if(count<0)
                return  -1;
            pos=0;
            byte b= buf[pos];
            count--;
            pos++;
            return b&255;
        }
        else if(count>0)
        {
            byte b= buf[pos];
            count--;
            pos++;
            return b&0xff;
            //255的十六进制。
        }
        return -1;
    }
    public void myClose() throws IOException
    {
        in.close();
    }
}
/*
byte： -1  ——》 int ; -1
Mp3为二进制数据。
000000010010101001000101
111111100000000000000000
转成十进制有可能为负数。
0000-0001 十进制1
1111-1111 十进制-1（1的二进制取反加1）
11111111  ——》提升了一个int类型，那不还是-1吗？是-1的原因是因为在8个1前面补的是1导致的。
那么我只要在前面补0，即可以保留原字节数据不变。又可以避免-1的出现。
*/