package QuesAndAns;

public class Q8P2_OccurenceOfCharacterInString {
    public static void main(String[] args) {
        String str = "Testing solutions";
        System.out.println(OccurenceOfCharacter(str , 'l'));
    }
    public static long OccurenceOfCharacter(String str , char c){
        return str
                .chars()
                   .filter(e ->(char)e == c )
                       .count();
    }
}
