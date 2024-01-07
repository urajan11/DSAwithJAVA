public class LENGTHSTRING {
    public static int LengthOfString(String str) {
        // base case
        if (str.length() == 0) {
            return 0;
        }
        return LengthOfString(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        String str = "Rajan";
        System.out.println(LengthOfString(str));
    }
}
