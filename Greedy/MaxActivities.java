import java.lang.reflect.Array;
import java.util.*;

public class MaxActivities {

    public static void main(String args[]) {
        //Sorted End time
        /* int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; 
        // end time basic sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1 st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    } */

    //unsorted
    int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 9, 6, 7, 9, 4 };
        // Sorting 
        int acti[][]= new int[start.length][3];

        for(int i=0;i<start.length;i++){
            acti[i][0] = i;
            acti[i][1] = start[i];
            acti[i][2] = end[i];
        }

        // lamda function -> ShortForm
        Arrays.sort(acti, Comparator.comparingDouble(o -> o[2]));
        //end time basic sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
    
        //1 st activity
        maxAct = 1;
        ans.add(acti[0][0]);
        int lastEnd = acti[0][2];
        for (int i = 1; i < end.length; i++) {
            if (acti[i][1] >= lastEnd) {
            maxAct++;
            ans.add(acti[i][0]);
            lastEnd = acti[i][2];
            }
        }
        System.out.println("Max Activity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
