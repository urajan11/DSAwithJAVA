public class Solution {
    public static int mostFrequentEven(int nums[]) {
        int key = 0;
        for (int i = 0; i < nums.length; i++) 
        {

            if (nums[i] % 2 == 0)
            {
                key++;
            }
        }
        return key;
    }

    public static void main(String args[]) 
    {
            int nums[]={0,2,2,4,3};
            System.out.println( mostFrequentEven(nums));
    
    }
}