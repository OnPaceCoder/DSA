package DSA_Java.MathProblems;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12344321;
        int temp = n;
        int rev = 0;
        int rem = 0;
        while(n>0){
             rem = n%10;
            rev = rev * 10 + rem;
            n/=10;

        }
System.out.println(rev);
        if(rev==temp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
