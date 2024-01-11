package QuesAndAns;

import org.w3c.dom.ls.LSOutput;

public class Q13_CapitalisedCharcterCount {
    public static void main(String[] args) {
        String str= "ThisIsOurGroupWeLearnHereTogether";
        int count=0;
        //1.
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
        int count2=0;
        for(int i=0;i<str.length();i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count2++;
            }
        }
        System.out.println(count2);
    }
}
