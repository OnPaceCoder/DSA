package DSA_Java.Arrays;

public class RotateLeftByK {


    public static  int[] reverse(int[] arr , int start , int end){
      
        
        while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++ ;
         end--;
             

        }

        return arr;
    }


  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
        int d = 9 ;
        d = d% arr.length;

    reverse(arr , 0 , d-1 );
    reverse(arr, d, arr.length-1);
    reverse(arr, 0, arr.length-1);





    for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
    }
   


  }  
}
