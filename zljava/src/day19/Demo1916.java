package day19;

import java.io.*;


/*
* 1,源：键盘录入。
* 目的：控制台
* 2，需求：想把键盘录入的数据存到一个文件中。
* 源：键盘。
* 目的：文件。
* 3,需求：想要将一个文件的数据打印在控制台上。
* 源：文件。
* 目的：控制台。
* 流操作的基本规律：
* 最痛苦的就是流对象有很多，不知道该用哪一个。
* 通过三个明确来完成。
* 1，明确源和目的。
*   源：输入流：InputStream Reader
*   目的：输出流： OutputStream Writer
* 2，明确操作的数据是否是纯文本。
*   是：用字符流
*   不是：字节流。
* 3，当体系明确后，再明确要使用哪个具体的对象。
*   通过设备来进行区分。
*   源设备：内存，硬盘，键盘。
*   目的设备：内存，硬盘，控制台。
*
*   1，将一个文件中的数据存储到另一个文件中。复制文件。
*       源：因为是源，所以使用读取流，InputStream Reader
*       是不是操作文本文件。
*       是！这是就选择Reader
*       这样体系就明确了。
*       接下来明确要使用该体系中的哪个对象。
*       明确设备：硬盘。上一个文件。
*       Reader体系中可以操作文件的对象时FileReader
*
*       是否需要提高效率： 是！加入Reader体系中的缓冲区： BufferedReader
*       FileReader fr=new FileReader("a.txt");
*       BufferedReader bufr=new BufferedReader(fr);
*
*
*
*       目的：OutputStream Writer
*       是否是纯文本。
*       设备：硬盘，一个文件。
*       Writer体系中可以操作文件的对象FileWriter
*       是否需要提高效率： 是！加入Writer体系中的缓冲区： BufferedWriter
*       FileWriter fw=new FileWriter("b.txt");
*       BufferedWriter bufw=new BufferedWriter(fw);
*
* 练习,将一个图片文件中数据存储到另一个文件中。复制文件，要按照以上需求进行明确。
*
*
* 2，需求：将键盘录入的数据保存到一个文件中，复制文件，按照以上格式自己完成三个明确
* 这个需求有源和目的都存在。
* 那么分别分析
* 源：InputStream Reader
* 是不是纯文本？是！Reader
* 设备：键盘，对应的对象时System.in。
* 不是选择Reader么？System.in对应的不是字节流么？
* 为了操作键盘的文本数据方便。转成字符流按照字符串操作最方便。
* 所以既然明确了Reader，那么就将System.in转换成Reader，用到了Reader体系中的转换流，
* InputStreamReader
* InputStreamReader isr=new InputStreamReader(System.in);
* 需要提高效率么？需要！BufferedReader
*
* 目的：OutputStream Writer
* 是否是纯文本？是! Writer
* 设备：硬盘，一个文件。使用FileWriter。
* 需要提高效率么？需要。
*
* 扩展一下，想要把录入的数据按照指定的编码表（utf-8）,将数据存到文件中。
* 但是存储时，需要加入指定编码表，而指定的编码表只有转换流可以指定。
* 所以需要使用的对象时OutputStreamWriter。
* 而该转换流对象要接收一个字节输出流。而且还可以操作的文件的字节输出流。FileOutputStream。
* OutputStreamWriter osw=new OutputStreamWriter（new FileOutputStream（"d.txt"）,"UTF-8"）;
*
*所以，记住，转换流什么时候使用，字符和字节之间的桥梁，通常，涉及到字符编码转换时用到。
* */
/**
 * Created by zhangsanshi on 2016/9/27.
 */
/*
* 通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理。
* 也就是readLine方法。
* 能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？
*readLine方法是BufferedReader类中的方法。
* 而键盘录入的read方法时字节流InputStream的方法。
* 那么能不能将字节流转成字符流，然后再使用字符流缓冲区的readline方法呢。
 *  */
public class Demo1916
{
    public static void main(String [] args) throws IOException {
        //获取键盘录入对象。
       // InputStream in=System.in;
        //将字节流对象转成字符流对象，使用InputStreamReader对象。
       // InputStreamReader isr=new InputStreamReader(in);
        //为了提高效率，将字符串进行缓冲区技术高效操作，使用BufferReader
        //BufferedReader bufr=new  BufferedReader(isr);
        //键盘录入的最常见写法。
        //BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));//上面三句变一句
        BufferedReader bufr=new BufferedReader(new InputStreamReader(new FileInputStream("e:\\Demo.txt")));//上面三句变一句
        //OutputStream out=System.out;
        //OutputStreamWriter osw=new OutputStreamWriter(out);
       // BufferedWriter bufw=new BufferedWriter(osw);
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line=null;
        while((line=bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
           // System.out.println(line.toUpperCase());
           bufw.write(line.toUpperCase());
            bufw.newLine();
           bufw.flush();
        }
        bufr.close();
    }

}
