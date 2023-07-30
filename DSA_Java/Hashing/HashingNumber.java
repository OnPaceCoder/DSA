package DSA_Java.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashingNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Size of Array
        int size = in.nextInt(); // 5

        int[] arr = new int[size]; // arr = [1 3 1 2 4]
        // Input Elements of Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // PreCompute
        // int[] hash = new int[10];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            // hash[arr[i]] +=1;
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // Input Number of Test Cases
        int q = in.nextInt();
        while (q > 0) {
            // Input Elements to be checked for test case
            int number = in.nextInt();
            // System.out.println(hash[number]);
            System.out.println(hash.getOrDefault(number, 0));

            // Fetch
            q--;
        }

        in.close();

    }
}
