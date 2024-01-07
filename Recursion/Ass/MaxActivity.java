import java.util.*;

public class MaxActivity {

  public static void main(String args[]) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };
    //end time basic sort
    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    //1 st activity
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
  }
}
