public class FACTORIALUSERECURSION {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=fact(n-1);
        int f=n*fn;
        return f;
    }
    public static void main(String args[]){
        int n=-5;
        System.out.println("Factorial of "+n+":"+fact(n));     
    }
}
