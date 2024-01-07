public class CatalansNumber {

    // Recurssion
    public static int catlanNumRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0; // cn
        for (int i = 0; i <= n - 1; i++) {
            ans += catlanNumRec(i) * catlanNumRec(n - i - 1);
        }

        return ans;
    }

    public static int catalanNumTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) // Ci
        {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1]; // Ci = Cj-j-1
            }
        }
        return dp[n];
    }

    public static void main(String[] arg) {
        int n = 4;

        // System.out.println("catalan's Number: " + catlanNumRec(n));
        System.out.println("catalan's Number-: " + catalanNumTab(n));
    }
}
