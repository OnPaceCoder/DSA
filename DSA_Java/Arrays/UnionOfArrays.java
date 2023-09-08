package DSA_Java.Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class UnionOfArrays {

    static ArrayList<Integer> FindUnion(int arr1[] , int arr2[] , int n , int m){
        
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        ArrayList<Integer> Union = new ArrayList<Integer>();

        for(int i = 0 ; i< n; i++){
            s.add(arr1[i]);
        }
for(int i = 0 ; i< m; i++){
            s.add(arr2[i]);
        }

        for(int it: s){
            Union.add(it);
        }

        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,5,7,8,9,10};

        
        ArrayList<Integer> Union= FindUnion(arr1, arr2 , arr1.length, arr2.length);

        for (int val  : Union) {
            System.out.println(val);
        }
      
    }
    
}
