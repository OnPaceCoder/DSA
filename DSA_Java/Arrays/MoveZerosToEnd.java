package DSA_Java.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToEnd {
        public static void main(String[] args) {
            
            int arr[] = {1, 0 , 2 , 3 , 0 , 4,  0,0,5,0 ,7};

   
            List<Integer> temp=new ArrayList<Integer>();  

            for (int i = 0 ; i < arr.length; i++) {
                if(arr[i]!=0){
                        temp.add(arr[i]);
                }
            }   

            for (int i = 0; i < temp.size(); i++) {
                    arr[i] = temp.get(i);
            }

            for (int i = temp.size(); i < arr.length; i++) {
                    arr[i] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
            }


        }
}
