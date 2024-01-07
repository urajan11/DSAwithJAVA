import java.util.*;
public class palindrome {
    public static void poli(int n){
        int myn=n;
        int rev=0;
       while(n>0){
        int last=n%10;// find last digit
        rev=(rev*10)+last;
        n=n/10;
       }
        
        
        if(rev==myn){
            System.out.println(myn+ "  is Pylindrome");
        }
        else{
            System.out.println(myn+ "  is not Pylindrome");
        }
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        poli(n);

    }

    
}
