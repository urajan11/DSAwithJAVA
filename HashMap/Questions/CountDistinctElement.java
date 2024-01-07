import java.util.*;
public class CountDistinctElement 
{
    public static void main(String [] args)
    {
        HashSet<Integer> hs  = new HashSet<>();
        int nums[] = {1,2,4,3,5,1,3,2};
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        System.out.println(hs);
        System.out.println("Ans = "+hs.size());
    }
}
