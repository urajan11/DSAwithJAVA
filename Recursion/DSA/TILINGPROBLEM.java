public class TILINGPROBLEM { // DSA (Amazon)
    public static int Tilingsol(int n) {
        // Base case
        if (n == 1 || n == 0) {
            return 1;
        }
        // kaam
        // vertical choice
        /*
         * int fnm1 = Tilingsol(n - 1);
         * 
         * // Horizontal choice
         * int fnm2 = Tilingsol(n - 2);
         * 
         * // total ways to fit Tile
         * int totalway = fnm1 + fnm2;
         * return totalway;
         */
        return Tilingsol(n - 1) + Tilingsol(n - 2);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println("total ways of no: " + Tilingsol(n));
    }
}
