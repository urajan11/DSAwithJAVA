public class Kapsack_Tabulation {

    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0; // 0th col
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;// 0th row
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];

                if (w <= j) {
                    int incprofit = v + dp[i][j - w];
                    int excprofit = dp[i - 1][j];

                    dp[i][j] = Math.max(incprofit, excprofit);
                }

                else {
                    int excprofit = dp[i - 1][j];
                    dp[i][j] = excprofit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("The maximum profit for the { W } Kg knapsack: ");
        System.out.println(knapsackTab(val, wt, W));
    }
}
