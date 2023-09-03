package DSA_Java.Recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Subsequence {

    public static void subseq(int  i , ArrayList<Integer> arr){
        if(i > arr.size()) {

          Iterator<Integer> it = arr.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
          }
          return;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
      

        while(n>0){
        arr.add(in.nextInt());    
        n--;
        }
        in.close();
subseq(0 ,arr);


    }
}
