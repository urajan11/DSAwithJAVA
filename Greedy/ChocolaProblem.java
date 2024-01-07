import java.util.*;

public class ChocolaProblem {
    public static void main(String args[]) {
        int n = 4, m = 6;//4*6=24
        Integer VerCost[] = {2,4}; // m-1
        Integer HorCost[] = { 3,1 }; // n-1;
        // Sort decresing order
        Arrays.sort(VerCost, Collections.reverseOrder());
        Arrays.sort(HorCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // hor price, ver price
        int cost = 0;
        while (h < HorCost.length && v < VerCost.length) {
            if (VerCost[v] <= HorCost[h]) {// vertical < horizontal
                cost += (HorCost[h] * vp);
                hp++;
                h++;
            } else {
                cost += (VerCost[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < HorCost.length) {
            cost += (HorCost[h] * vp);
            hp++;
            h++;
        }
        while (v < VerCost.length) {
            cost += (VerCost[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Min cut cost = " + cost);
    }
}
