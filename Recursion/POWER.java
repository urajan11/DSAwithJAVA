public class POWER {
    // with TC =O(n) following code find x pow n
    public static int powx(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powx(x, n - 1);
    }

    // Optimize code
    // with TC=O(log n) code find x pow n
    public static int optimizePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizePower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // n odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        // System.out.println(powx(3, 10));
        System.out.println(optimizePower(2, 10));
    }

}
