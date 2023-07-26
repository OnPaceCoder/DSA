package DSA_Java.Recursion;

public class PrintN {
//Method 1:
    static void Print(int i , int n){
        if(i > n) return;
        System.out.println(i);
        Print(i+1,n);
    }


    //Method 2:
    static void Print2(int i ){
        if(i < 1) return;
        Print2(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        

        int n =5;
        System.out.println("Method 1 :");
        Print(1, n);

        System.out.println("Method 2 :");
        Print2(n );
    }    
}
