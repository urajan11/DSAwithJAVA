public class FINDPERMUTATION {
    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        // Recursion  TC=O(n*n!)

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"= "ab"+"de"="abde"-> remove c
            String NewStr = str.substring(0, i) + str.substring(i + 1, str.length());
            permutation(NewStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        permutation(str, "");
    }
}
