package DSA_Java.Arrays;


//Optimal Approach to find  largest element from an array
//Step -1 : Consider first element to be largest
//Step -2 : Loop through an array and compare each element with largest element 
//Step -3 : If an element in an array is larger than largest then update largest element.
//Time Complexity = O(n)

public class FindLargestOptimal {

    public static void main(String[] args) {
        int arr[] = { 12, 22, 23, 45, 44, 11 };

        int largerNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largerNum < arr[i]) {
                largerNum = arr[i];
            }
        }
        System.out.println("Largest Element is : " + largerNum);
    }
}
