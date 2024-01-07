import java.util.*;
import java.util.ArrayList;

//Flipcart
public class MOSTWATER {
    /*
     * public static int StoreWater(ArrayList<Integer> height) {
     * int maxWater = 0;
     * // brute Force
     * // TC= O(2^n)
     * for (int i = 0; i < height.size(); i++) {
     * for (int j = i + 1; j < height.size(); j++) {
     * int ht = Math.min(height.get(i), height.get(j));
     * int width = j - i;
     * int currWater = ht * width;
     * maxWater = Math.max(maxWater, currWater);
     * }
     * }
     * return maxWater;
     * }
     */

    // 2 pointer approch
    // TC=O(n)
    public static int waterStore(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int MaxWater = 0;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            MaxWater = Math.max(MaxWater, currWater);
            // update prt
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return MaxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println("Most Store water:" +StoreWater( height));
        System.out.println("Most Store water:" + waterStore(height));
    }

}
