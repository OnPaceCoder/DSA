package DSA_Java.Arrays;

import java.util.ArrayList;

public class UnionOfArraysOptimal {

    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2,int  n , int  m){

        ArrayList<Integer> Union = new ArrayList<Integer>();

        int i =  0 , j = 0;

        while(i < n && j < m){

            if(arr1[i]<=arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]){
                        Union.add(arr1[i]);
                }
                i++;
            }
            else {
                    if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                        Union.add(arr2[j]);
                    }
                    j++;
            }


        }
        while(i < n) {
            if(Union.size() == 0 || Union.get(Union.size()-1) != arr1[1]){

                Union.add(arr1[i]);
            }
            i++;
        }

          while(j < m) {
           if(Union.size() == 0 || Union.get(Union.size()-1) != arr2[j]){
                        Union.add(arr2[j]);
                    }
                    j++;
        }
        return Union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,5,7,8,9,10};

    



        ArrayList<Integer> Union= FindUnion(arr1, arr2 , arr1.length, arr2.length);

        for (int val : Union) {
                System.out.println(val);
        }
        
    
    }



}
