package DSA_Java.Arrays;

public class MoveZerosToEndOptimal {

    public static int[] swap(int[] arr , int i , int j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return arr;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 0 , 2 , 3 , 0 , 4,  0,0,5,0 ,7};


        //Find index of first 0 element;

        int i ;
        int j = -1;
        for ( i = 0 ; i < arr.length; i++) {
            
            if(arr[i]==0) {
                j = i;
                break;
            }
            
        }


       for ( i = j+1 ; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
       }
        

       for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
       }
    }
}
