public class SUMNNUMBER {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int s=Sum(n-1);
        int sm=n+s;
        return sm;
    }

    public static void main(String args[]){
        int n=5;
        System.out.println("Sum of n no:"+Sum(n));
    }
}
// TC=O(n)
//SC=O(n)