public class GRIDWAY {
    public static int ways(int n, int m,int i, int j){
        //Base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n||j==m){
            return 0;
        }
        //only right and down condition
        int w1=ways(n, m, i+1, j);
        int w2=ways(n, m, i, j+1);
        return w1+w2;
    }
    public static void main(String args[]){
        System.out.println(ways(3, 3, 0, 0));
    }
    
}
//TC=O(2^n+m)- exponential