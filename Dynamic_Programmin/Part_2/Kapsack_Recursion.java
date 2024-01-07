public class Kapsack_Recursion {

    public static int kapsackRec(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        // Valid
        if (wt[n - 1] <= W) {
            // Include
            int ans1 = val[n - 1] + kapsackRec(val, wt, W - wt[n - 1], n - 1);

            // Exclude
            int ans2 = kapsackRec(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        }

        // invalid
        else {
            return kapsackRec(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println("The maximum profit for the { W } Kg knapsack: ");
        System.out.println(kapsackRec(val, wt, W, val.length));

    }
}
