package QuesAndAns;
import java.util.stream.*;

public class Q2_PrintNumberWithoutLoop {
    /* print 1 to 100 without using loop
        you can use numbers
     */
    public static void main(String[] args) {
        printnum(1);
        printnum(1,100);
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }
    public static void printnum(int num){
        if(num<=100) {
            System.out.println(num);
            num++;
            printnum(num);
        }
    }
    public static void printnum(int strnum , int endnum){
        if(strnum<=endnum){
            System.out.println(strnum);
            strnum++;
            printnum(strnum,endnum);
        }
    }
}
