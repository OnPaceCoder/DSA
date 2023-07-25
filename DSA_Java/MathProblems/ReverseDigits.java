package DSA_Java.MathProblems;

public class ReverseDigits {
   public static void main(String[] args) {
     int n = 13242;
    int rev = 0;
    while(n>0){
        int rem = n%10;
        rev = rev * 10 + rem ;
        n/=10;
    }
    System.out.println(rev);
   }
}
