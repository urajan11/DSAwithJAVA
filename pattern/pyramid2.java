import java.util.*;
public class pyramid2 {
    public static void pyr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
    public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
    pyr(n);
    }
    
}
