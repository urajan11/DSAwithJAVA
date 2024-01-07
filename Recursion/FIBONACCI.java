public class FIBONACCI {
    public static int Fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = Fibo(n - 1);
        int fn2 = Fibo(n - 2);
        return fn1 + fn2;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibo(i));
        }

    }
}
