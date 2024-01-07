public class Fibonaci {

    public static int Fibo(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = Fibo(n - 1, f) + Fibo(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1]; // 0 ,0 ,0
        for (int i = 0; i < n; i++) {
            System.out.print(Fibo(i, f));
        }
    }
}
