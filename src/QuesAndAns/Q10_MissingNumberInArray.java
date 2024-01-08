package QuesAndAns;

public class Q10_MissingNumberInArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,6,7,8,9,10};
        int n =  GetNumber(num,10);
        System.out.println(n);
    }
    public static int GetNumber(int num[] , int totalcount){
        int expsum = (totalcount*(totalcount+1)/2);
        int actualsum = 0;
        for (int i:num){
            actualsum+=i;
        }

        return expsum-actualsum;
    }
}
