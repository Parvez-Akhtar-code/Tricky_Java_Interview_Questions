package QuesAndAns;

import java.util.Arrays;

public class Q3_PrintNumberWithoutRecression {
    /* print 1 to 100 without using loop and recression method
        you can use numbers
     */
    public static void main(String[] args) {
        Object[] num = new Object[100];

        Arrays.fill(num , new Object(){
          int   count=1;
            public String toString(){
        return Integer.toString(count++);
        }
        });
        System.out.println(Arrays.toString(num));
    }
}
