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
            
            for (int i = 0; i < 5; i++) {
                    for (char ch = 'A', j = 5; j > i; j-- , ch++) {
                            System.out.print(ch);
                    }
                    System.out.println();
                }
        }
}
