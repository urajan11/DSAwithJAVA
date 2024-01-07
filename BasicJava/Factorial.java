import java.util.*;
public class Factorial {
    public static int fact(int n){
        int f=1;
        System.out.print("factor are: ");
        for (int i=1;i<=n;i++){
            f=f*i;

            if(n%i==0){
                System.out.print(","+i );
            }
           
        }
        return f;// Factorial of n
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\nFactorial is:  "+fact(n));
        
    }
    
}
