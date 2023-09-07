package DSA_Java.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int d = 9 ;
        d = d% arr.length;

        int temp[] = new int[d] ;
        for (int i = 0; i < d; i++) {
                temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
                arr[i-d] = arr[i];
        }

        for(int i = arr.length - d , j = 0; i < arr.length ;i++){
            arr[i] = temp[j];
            j++;
        }
        
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
    }
}
