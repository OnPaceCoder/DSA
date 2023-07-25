package DSA_Java.MathProblems;

import java.util.ArrayList;
import java.util.Collections;


public class PrintDivisor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 64;
        for (int i = 1; i*i <=n; i++) {
            if(n%i==0){
                list.add(i);
                
                if((n/i)!=i){
                    list.add(n/i);
                }
            }

        }
     
        Collections.sort(list);
       for(Integer i : list){
        System.out.println(i);
       }
    }
}
