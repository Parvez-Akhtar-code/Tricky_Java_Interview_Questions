package QuesAndAns;

public class Q6P4_PatternQuestionsLogic {
    public static void main(String[] args) {
        int a=65;
        for (int i=0;i<=5;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char)(a+i));
            }
            System.out.println();
        }
    }
}
