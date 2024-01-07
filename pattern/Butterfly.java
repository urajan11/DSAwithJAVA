import java.util.*;

public class Butterfly {
    public static void butt(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space- 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars-i 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = n; i >= 1; i--) {
            // stars- i
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // space- 2*(n-i)
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            // stars-i
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        butt(5);

    }

}
