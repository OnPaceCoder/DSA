package DSA_Java.Recursion;

   

public class PrintNRev {

    static void Print(int n){
        if(n<1) return ;
        System.out.println(n);
        Print(n-1);
    }
        public static void main(String[] args) {
            
            int n = 5;
            Print(n);
        }
}
