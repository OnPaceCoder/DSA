package DSA_Java.Arrays;

public class RemoveDuplicate {
        public static void main(String[] args) {

            int arr[] = {1, 1 , 2 , 2 , 3 , 3, 3, 4};

            
            int i = 0;
            for (int j = 1;  j <arr.length;  j++) {

                if(arr[j]!=arr[i]){
                    i  = i+1;
                    arr[i] = arr[j];
                }

            }   

            for (int j = 0; j < i; j++) {
                System.out.println(arr[j]);
            }

        }
}
