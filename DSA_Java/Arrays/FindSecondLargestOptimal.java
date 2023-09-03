package DSA_Java.Arrays;

public class FindSecondLargestOptimal {
        public static void main(String[] args) {
            int arr[] = {12, 22 , 23 , 45 , 44};
            int largest = arr[0];
            int secondLargest = -1;
            
            for (int i = 1; i < arr.length; i++) {
                    if(largest < arr[i]){
                        secondLargest  = largest ;
                        largest = arr[i];
                    }
                    if(secondLargest < arr[i] && largest > arr[i]){
                        secondLargest = arr[i];
                    }
                    
                }
                
                                    System.out.println("Second largest " + secondLargest);
        }
}
