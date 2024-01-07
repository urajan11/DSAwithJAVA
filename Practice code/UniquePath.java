public class UniquePath 
{
    public void unique(int m, int n)
    {
        int dp[][] = new int [m][n];
        for(int i=0;i<dp[0].length;i++)
        {
            // System.out.print( dp[0][i] = 1);
        }
        for(int i=0;i<dp.length;i++)
        {
            System.out.print( dp[i][0] = 1);
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
      //  return dp[m-1][n-1];
    }
    public static void main(String [] args)
    {
        UniquePath ob = new UniquePath();
        ob.unique(7, 3);
        // System.out.println( ob.unique(7, 3));

    }
}
