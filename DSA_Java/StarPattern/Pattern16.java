package DSA_Java.StarPattern;

/* 
  A
  BB
  CCC 
  DDDD 
  EEEEE 
 */
public class Pattern16 {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i < n; i++) {
                char ch = 'A';
                for (int j = 0; j <=i; j++) {
                    System.out.print((char)(ch + i));
                }
                System.out.println("");
            }
        }
}
