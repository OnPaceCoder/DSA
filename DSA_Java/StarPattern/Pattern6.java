package DSA_Java.StarPattern;

/*  1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
public class Pattern6 {
    public static void main(String[] args) {
        
        for (int i = 1; i <=5; i++) {
            for (int j = 5 , p = 1; j>=i; j-- , p ++) {
                System.out.print( p + " ");
            }
            System.out.println();
        }
    } 
}
