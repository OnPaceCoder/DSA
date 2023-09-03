package DSA_Java.Arrays;

import java.util.Arrays;

// Q - Find Second Largest element in an array
// BruteForce 
//Option 1 
//--------
// Step - 1 : Sort an array 
// Step - 2 : Return array[array.length - 2 ]  
//--------
//Option 2 
// Step - 0 : Sort an array
// Step - 1 : Consider array[ array.length - 1 ] to be largest 
// Step - 2 : Compare largest element with last second element (array[ array.length - 2 ])
// Step - 3 : If last second element is not equal to largest than return it other wise repeat with lowering index.
// Time complexity - o(nlogn + n )

public class FindSecondLargestBruteForce {
    public static void main(String[] args) {
        int arr[] = { 12, 22, 23, 45, 44 };
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (largest != arr[i]) {
                secLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Largest " + secLargest);

    }
}
