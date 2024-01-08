package QuesAndAns;

public class Q8_OccurenceOfCharacterInString {
    public static void main(String[] args) {
        String str = "I love coding and testing";
        GetCharOccurence(str,'g');
        GetCharCount(str , 'n');
    }
    public static void GetCharOccurence(String str , char val){
        int count=0;
        for (char ch : str.toCharArray()){

            if(ch==val){
                count++;
            }

        }
        System.out.println(val+":"+count);
    }

    public static void GetCharCount(String str , char val){
        int count=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==val){
                count++;
            }
        }
        System.out.println(val+":"+count);
    }
}
