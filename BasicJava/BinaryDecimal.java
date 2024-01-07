import java.util.*;

public class BinaryDecimal {
    public static void binDec(int n) {
        int mynum = n;
        int pow = 0;// for power value
        int dec = 0;
        while (n > 0) {
            int LastDigit = n % 10; // find last Digit
            dec = dec + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal of " + mynum + "= " + dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Accept binary value
        binDec(n);
    }

}
