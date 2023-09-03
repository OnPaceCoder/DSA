package DSA_Java.Arrays;



//Step - 1 : Find largest in first pass
//Step - 2 : Find second largest in second pass
//TC - O(2N)
public class FindSecondLargestBetter {
    public static void main(String[] args) {
        int arr[] = {12, 22 , 23 , 45 , 44};
        
            int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if(largest< arr[i]){
                    largest = arr[i];
                }
        }
            int secondLargest = -1;
        for (int j = 0; j < arr.length; j++) {

            if(secondLargest < arr[j] && arr[j] != largest){
                secondLargest = arr[j];
            }
        }
        System.out.println("Second Largest " + secondLargest);
    }
}
