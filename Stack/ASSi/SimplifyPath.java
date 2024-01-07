import java.util.*;

public class SimplifyPath {

    public static String Simplify(Strig A) {
        Stack<Integer> s = new Stack<>();
        String res = "";
        res += "/";
        int len_A = A.length();

        for (int i = 0; i < len_A && A.charAt(i); i++) {
            String dir = "";
            while (i < len_A && A.charAt(i) == "/") {
                i++;
                while (i < len_A && A.charAt(i) == "/") {
                    dir += A.charAt(i);
                    i++;
                }
            }
            if (dir.equals("..") == true) {
                if (!s.empty()) {
                    s.pop();
                } else if (dir.equals(".") == true) {
                    continue;
                } else if (dir.length() != 0) {
                    s.push(dir);
                }
            }
            Stack<Integer> s1 = new Stack<>();
            while (!s1.empty()) {
                s1.push(s.pop());

            }
            while (!s1.empty()) {
                if (s1.size() != 1) {
                    res += (s1.pop() + "/");
                } else {
                    res += s1.pop();
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        String str = new String("/a/./b/../../c/");
        String res = Simplify(str);
        System.out.println(res);
    }
}
