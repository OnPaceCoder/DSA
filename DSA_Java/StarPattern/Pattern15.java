package DSA_Java.StarPattern;

 /* 
  ABCDE 
  ABCD
  ABC
  AB
  A
 */
public class Pattern15 {
        public static void main(String[] args) {
            int n = 10;
            for (int i = 0; i < n; i++) {
                    for (char ch = 'A', j = (char)n; j > i; j-- , ch++) {
                            System.out.print(ch);
                    }
                    System.out.println();
                }
        }
}
