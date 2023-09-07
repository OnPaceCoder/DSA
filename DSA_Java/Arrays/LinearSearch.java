package DSA_Java.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int searchElement = 7;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == searchElement){
                    index = i;
                }
        }

        System.out.println(index);
    }
}
