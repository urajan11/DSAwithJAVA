import java.util.*;

public class KapSack {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50; // capacity of bag
        double ratio[][] = new double[val.length][2];

        // 0 th col => idx ; 1st => col = ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascending order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int FinalVal = 0;
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                FinalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // includind function items
                FinalVal += (ratio[i][1] * capacity);
                capacity = 0;
            }
        }
        System.out.println("Max Total Value = " + FinalVal);
    }
}
