import java.util.*;
public class LagagestSubarrayWithSumZero {
    
    public static void main(String [] args)
    {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        // Brute Force Approch
        /*int max_length = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                 // variable cursum to store the sum of subarray
                // that starts with ith index and ends with a jth index
                int cursum = 0;
                for(int k=i;k<=j;k++)
                    cursum = cursum + arr[k];
                // checks that the subarray has a sum of zero or not
                if(cursum == 0){
                    // if the sum of the subarray is zero and
                    // current subarray length is greater
                    // then update max_length
                    if(max_length < j-i+1)
                        max_length = j-i+1;
                }
            }
        }
        System.out.println(max_length);
        */

        // Using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            // System.out.print(sum+" ");

            if(map.containsKey(sum))
            {
                len = Math.max(len, i-map.get(sum));
                // System.out.println("Largesrt Subarray with sum 0 = "+len);
            }
            else
            {
                map.put(sum, i);
                // System.out.println(map);
            }
        }
        System.out.println("Largesrt Subarray with sum 0 = "+len);

    }
}
