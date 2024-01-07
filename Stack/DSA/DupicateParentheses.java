import java.util.*;

//microsoft
//google
public class DupicateParentheses {
    // TC = O(n)
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (/* s.peek() */s.pop != '(') {
                    // s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } /*
                   * else { // opning pair
                   * s.pop();
                   * }
                   */
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "(((a+b)+(c+d)))";
        String str1 = "(a+b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
