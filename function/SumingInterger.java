import java.util.*;
public class SumingInterger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int myn=n;
        int sum=0;
        while(n>0){
            int LastD=n%10;
            sum+=LastD;
            n=n/10;
        }
        System.out.println(myn+" Sum of integere digit: "+sum);
    }

    
}
