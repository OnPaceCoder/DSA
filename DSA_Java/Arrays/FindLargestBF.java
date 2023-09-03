package DSA_Java.Arrays;

import java.util.Arrays;

public interface FindLargestBF {
    // Brute Force Approach
    //Step - 1 : Sort an Array
    //Step - 2 : Return Last Element
    //Condition - Works only when array elements are unique

    //Time Complexity - Arrays.sort() -> O(nlogn) 
    //Space Complexity - n 
    // n - n is the number of elements in a given array
    public static void main(String[] args) {
    
            int arr[] = {12, 22 , 23 , 45 , 44};

            Arrays.sort(arr);
            System.out.println(arr[arr.length -1]);
    }
}
