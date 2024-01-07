import java.util.*;

public class IndianCoinsUsed {
    public static void main(String args[]) {
        Integer Coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(Coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int CountOfCoins = 0;
        int amount = 1000000000;

        for (int i = 0; i < Coins.length; i++) {
            if (Coins[i] <= amount) {
                while (Coins[i] <= amount) {
                    CountOfCoins++;
                    ans.add(Coins[i]);
                    amount -= Coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used = " + CountOfCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
