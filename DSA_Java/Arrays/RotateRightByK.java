package DSA_Java.Arrays;

public class RotateRightByK {
    public static int[] reverse(int[] arr, int start , int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }


        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 9;


        k = k%nums.length;
        reverse(nums , nums.length-k, nums.length-1);

        reverse(nums , 0 , nums.length-k-1);
        reverse(nums,0, nums.length-1);


        for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
        }
    }
}
