import java.util.*;
public class SubarraySumEQLTk 
{
    public static void main(String [] args)
    {
        int arr[] = {10,2,-2,-20,10};
        int k= -10;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            // System.out.print(sum+" ");
            // System.out.println("---"+(sum-k));
            if(map.containsKey(sum-k))
            {

                ans += map.get(sum-k);
                // System.out.println("...."+ans);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            // System.out.println(map);
        }
        System.out.println("Ans = "+ ans);
    }
}
