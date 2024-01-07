import java.util.*;
public class TwoSum 
{
    public static void main(String [] args)
    {
        int arr[] = { 2, 7, 11, 15 };
        int targest = 9;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
                //Sum, Count
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            // System.out.println(sum);

            if(map.containsKey(sum - targest))
            {
                // hs.add(arr[i]);
                ans += map.get(sum - targest);
                // System.out.println("--"+i);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
            // System.out.println(map);
        }
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                s = arr[i]+arr[j];
                if(s == targest)
                {
                    hs.add(arr[s]);
                }
            }
        }
        System.out.println(ans);
        System.out.println(hs);
    }    
}
