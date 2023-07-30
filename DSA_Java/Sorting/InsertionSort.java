package DSA_Java.Sorting;

public class InsertionSort {


    public static void insertion_sort(int arr[]) {

    
            for (int i = 0; i < arr.length; i++) {
                int j = i;
                while(j>0 && arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        j--;
                }

            }




        for (int i : arr) {
                System.out.print(i + " ");
        }
    }
        public static void main(String[] args) {
            
            int arr[] = {12,3, 21,15 ,44, 1};

            insertion_sort(arr);

        }
}
