package day03;

/**
 * Created by zhanglei on 2016/4/21.
 */
public class loopsentence {

    public static void main(String [] args){
       /*  int x=1;
        while(x<3)
        {
            System.out.println("x="+x);
            x++;

        }*/

/*
        int x=1;
        do {
            System.out.println("x="+x);
            x++;
        } while (x<3);
  */

   //while：先判断条件，只有条件满足才执行循环体
    //do while 先执行循环体，再判断条件满足，再继续执行循环体 无论条件是否满足，循环至少执行一次
//提示，当x初值为零时，while不执行，do while执行一次

/* for(初始化表达式；循环条件表达式；循环后的操作表达式)
{
执行语句}
 */
/*
 for(int x=0;x<3;x++)
        {
            System.out.println("x="+x);

        }
        */

/*
for循环和while的区别；for（int x）x只在小括号内起作用，for循环
结束，则x变量空间释放。所以如果变量只为循环而存在，用for循环更好
*/

int x=1;
        for (System.out.println("a");x<3;System.out.println("c"))
        {
          //for(1合法表达式就可以（可以为多表达式，中间用逗号隔开）；2必须是条件表达式（也可以省略）；合法表达式就可以)
          //最简单的循环形式for（；；）{ }
            // while（true）{ }
            System.out.println("d");
               x++;
        }



    }

}
