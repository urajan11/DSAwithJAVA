public class TowerOfHanoi {
    public static void tower(int n, String src, String helper, String dest) {
        // base case
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Recursion
        // transfer top n-1 from src to helper using dest as 'helper'
        tower(n - 1, src, dest, helper);
        // transfer nth from src to desk
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        // tansefer n-1 from helper to desk using src as 'helper'
        tower(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        tower(n, "A", "B", "C");
    }

}
