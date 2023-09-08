package DSA_Java.Arrays;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        
        int arr[] = {1, 1, 0 , 1,1, 1, 0, 0 , 1, 1, 1,1,1,1,1,1,1 , 0};


        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {



            if(arr[i]==1){
                count++;
            }
            else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        maxCount = Math.max(maxCount, count);
    System.out.println(maxCount);
    }
}
