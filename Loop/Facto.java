import java.util.*;
public class Facto {
    public static void fact(int n){
        int fac=1;
        for( int i=1;i<=n;i++){
            fac*=i;
            if(n%i==0){
                System.out.print(","+i);
            }
        }
        System.out.println(":"+fac);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
    
}
