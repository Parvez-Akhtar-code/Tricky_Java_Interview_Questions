package QuesAndAns;

import java.util.HashSet;
import java.util.Set;

public class Q5_DuplicateElementsInArray {
    public static void main(String[] args) {
        String[] infra = {"amazon","flipkart","dunzo","uber","amazon","uber"};

        for (int i =0;i<infra.length;i++){
            for (int j=i+1;j<infra.length;j++){
                if(infra[i].equals(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }
        System.out.println("____________________________________________________");
        Set<String> set = new HashSet<String>();
        for(String e : infra){
            if(set.add(e)==false){
                System.out.println(e);
            }
        }
    }
}
