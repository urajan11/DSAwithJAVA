import java.util.Arrays;

public class MatrixCM {

    public static int mcm(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalCost);
        }

        return ans;

    }

    public static int mcmMemoization(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemoization(arr, i, k, dp);
            int cost2 = mcmMemoization(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }

        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;

        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        // System.out.println(mcm(arr, 1, n - 1));
        System.out.println(mcmMemoization(arr, 1, n - 1, dp));
    }
}
