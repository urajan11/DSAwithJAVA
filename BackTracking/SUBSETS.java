public class SUBSETS {
    public static void FindSubArray(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // recursion
        // yes choice
        FindSubArray(str, ans + str.charAt(i), i + 1);
        // no choice
        FindSubArray(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        FindSubArray(str, "", 0);
    }
}
