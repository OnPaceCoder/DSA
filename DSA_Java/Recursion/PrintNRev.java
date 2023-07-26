package DSA_Java.Recursion;

   

public class PrintNRev {
//Method:1 
    static void Print(int n){
        if(n<1) return ;
        System.out.println(n);
        Print(n-1);
    }


    //Method:2 
    static void Print2(int i , int n){
        if(1 > i) return;
        Print2(i-1 , n+1);
        System.out.println(n);
        
    }
        public static void main(String[] args) {
                System.out.println("Method 1:");
            int n = 5;
            Print(n);

            System.out.println("Method 2:");

            Print2(n , 1);
        }
}
