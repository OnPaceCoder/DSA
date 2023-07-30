package DSA_Java.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashingChar {
    
public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        // Input String
        String s = in.nextLine(); // 5



        // PreCompute
        // int[] hash = new int[26];
         HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            // hash[s.charAt(i) - 'a'] +=1;
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
            
        }
        int q = in.nextInt();
        while (q > 0) {
            // Input Elements to be checked for test case
            char c = in.next().charAt(0);

            // System.out.println(hash[c-'a'] );
            System.out.println(hash.getOrDefault(c, 0));

            // Fetch
            q--;
        }

        in.close();
        
}
}
