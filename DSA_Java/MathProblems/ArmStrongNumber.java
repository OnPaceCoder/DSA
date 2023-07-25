package DSA_Java.MathProblems;

public class ArmStrongNumber {
    public static void main(String[] args) {
        
        int n = 371;
        int temp = n;

        int count = (int)Math.log10(n) + 1;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans+= Math.pow(rem, count);
            n/=10;
        }
        if(ans == temp) System.out.println("True");
        else System.out.println("False");
    }
}
