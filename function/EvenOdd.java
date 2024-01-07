import java.util.*;
public class EvenOdd {
    public static void EO(int n){
        boolean x=true;
        if(n%2==0){
          x= true;
        }
        else{
           x= false;
        }
        if(x==true){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        EO(n);
    }
    
}
