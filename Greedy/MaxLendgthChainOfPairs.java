import java.util.*;

public class MaxLendgthChainOfPairs {
    public static void main(String args[]) {
        int pairs[][] = { { 5, 24 }, { 39, 40 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // Sorting
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int chainend = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainend) {
                chainlen++;
                chainend = pairs[i][1];
            }
        }
        System.out.println("Max length Chain of pairs =" + chainlen);
    }
}
