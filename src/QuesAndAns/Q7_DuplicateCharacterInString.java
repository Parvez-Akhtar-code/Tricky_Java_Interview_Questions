package QuesAndAns;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q7_DuplicateCharacterInString {
    public static void main(String[] args) {
        DuplicateCharacter("java");
        DuplicateCharacter("A");
        DuplicateCharacter("naveen");
    }
    public static void DuplicateCharacter(String str){
        if(str==null){
            System.out.println("String is null");
            return;
        }
        if(str.isEmpty()){
            System.out.println("String is empty");
        }
        if (str.length()==1){
            System.out.println("String have only one character");
        }

        char words[] = str.toCharArray();

        Map<Character , Integer> charmap = new HashMap<Character , Integer>();
        for (Character ch : words){
            if (charmap.containsKey(ch)){
                charmap.put(ch , charmap.get(ch)+1);
            }
            else {
                charmap.put(ch , 1);
            }
        }

        Set<Map.Entry<Character , Integer>> entrySet= charmap.entrySet();
        for (Map.Entry<Character , Integer> entry : entrySet){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

    }
}
