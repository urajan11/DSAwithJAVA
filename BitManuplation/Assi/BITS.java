import java.util.*;

public class BITS {
    public static void xor(int n) {
        if (n != 0) {
            int x = n ^ n;
            System.out.println(x);
        } else {
            System.out.println("enter another no");
        }
    }

    public static void Swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swap  a=" + a + " b= " + b);
    }

    public static void Integeraddone(int n) {
        System.out.println(n + " + " + 1 + " is " + -~n);
    }

    public static void conUPtoLW() {
        // convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            // abcdefghijklmn....
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int a = 4;
        int b = 6;
        // xor(n);
        // Swap(a,b);
         Integeraddone(n);
        //conUPtoLW();
    }

}
