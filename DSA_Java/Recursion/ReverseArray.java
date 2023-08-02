package DSA_Java.Recursion;

public class ReverseArray {

    public static void f(int i , int arr[] , int n) {

        if(i>=n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        f(i+1, arr,n); 

    }
    public static void main(String[] args) {
        int[] arr = {1,3, 4,5,6};
        f(0 , arr, arr.length);


        for (int i : arr) {
                System.out.println(i+ " ");
        }
    }
}
