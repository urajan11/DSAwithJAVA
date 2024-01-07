public class CountSubstring {
    public static int SubString(String str, int i, int j, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = SubString(str, i + 1, j, n - 1) +
                SubString(str, i, j - 1, n - 1) -
                SubString(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "aba";
        int n = str.length();
        System.out.print(SubString(str, 0, n-1, n));
    }

}
