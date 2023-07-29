package DSA_Java.Sorting;

public class BubbleSort {
    

   

    public static void bubbleSort(int arr[] ) {
        for (int i = 0; i <arr.length-1; i++) {
             boolean flag = false;
            for (int j = 0; j <=arr.length -2; j++) {
                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            
            }
            if(flag == false){
                break;
            }
            
        }

        for (int i : arr) {
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        
            int[] arr = { 12,22,23,44,45};


        bubbleSort(arr);



    }

}
