import java.util.Arrays;

public class ClibingStrairs {
    // condition is at one time we can climb 1 stair at a time of 2 stairs at the
    // time
    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) {
            return ways[n];
        }

        // return countWays(n - 1) + countWays(n - 2); // recursive techniqu :
        // TC = O(2^n)
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways); // using dp -> Memoization : TC = O(n)
        return ways[n];
    }

    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        // Tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1); // field all array location with -1
        System.out.print("Total ways to Climb stairs: ");
        // System.out.print(countWays(n)); // By using recurtion
        System.out.print(countWays(n, ways)); // Using Memoization
        System.out.println("\nUsing Tabulation: ");
        System.out.print("Total ways to Climb stairs: ");
        System.out.print(countWaysTab(n));
    }
}
