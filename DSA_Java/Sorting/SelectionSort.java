package DSA_Java.Sorting;

public class SelectionSort {


    public static void selection_sort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i; j < arr.length ; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
             arr[i] = arr[min];   
            arr[min] = temp; 
        }   
        for (int i : arr) {
                System.out.println( i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 33, 22, 54, 7};

        selection_sort(arr);

        }
}
