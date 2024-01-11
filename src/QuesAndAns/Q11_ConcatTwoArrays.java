package QuesAndAns;

import java.util.stream.Stream;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Streams;

import java.util.Arrays;

public class Q11_ConcatTwoArrays {
    public static void main(String[] args) {
        String Bats[] = {
                "Rohit","Virat","Shubman","Ishaan","Hardik",
        };
        String Bowl[]= {
                "Shami","Siraj","Bumrah","Chahal","Kuldeep"
        };
        // Java 8 Streams
        Stream<String> sbat =Arrays.stream(Bats);
        Stream<String> sbowl =Arrays.stream(Bats);
        String players[] = Stream.concat(sbat , sbowl).toArray(size -> new String [size]);
        for (String s : players ){
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
//        Google guava Meaven
        String allplayers[] = ObjectArrays.concat(Bats,Bowl, String.class);
        for(String s : allplayers){
            System.out.println(s);
        }

    }
}
