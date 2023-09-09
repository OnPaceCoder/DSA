package DSA_Java.MathProblems;

import java.util.HashSet;

public class HappyNumber {
   
    
    
    static boolean isHappy(int n) {
         HashSet<Integer> set=new HashSet<Integer>(); 

        while (true) {
                 int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum+= rem*rem;
            n/=10;
        } 

        if(sum == 1) return true;

        n = sum;

        if(set.contains(n)) return false;
        set.add(n);



        }
    }

    public static void main(String[] args) {

        System.out.println(isHappy(19));
    }   
}
