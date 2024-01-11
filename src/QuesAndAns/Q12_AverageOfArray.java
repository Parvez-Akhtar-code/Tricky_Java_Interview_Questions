package QuesAndAns;

import com.google.common.math.DoubleMath;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Q12_AverageOfArray {
    public static void main(String[] args) {
        int num[] = {12,34,56,78,90,23,45,67,89};
        int total = 0;
        for(int i : num){
            total = total+i;
        }
       int avg1 = total/num.length;
        System.out.println(avg1);

        //java streams
        OptionalDouble avg2 = Arrays.stream(num).average();
        System.out.println(avg2.getAsDouble());

        //google guava
        double avg3 = DoubleMath.mean(num);
        System.out.println(avg3);
    }
}
