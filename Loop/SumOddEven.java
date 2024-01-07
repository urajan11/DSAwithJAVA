import java.util.*;

public class SumOddEven {
    public static void OD(int n){
        int i=0;
        int sumO=0;
        int sumE=0;
        while(i<n){ // counter i to n
            if(i%2==0){
                sumE=sumE+i;

            }
            else{
                 sumO=sumO+i;
            }
            i++;
        }
        System.out.println("Sum of even no: "+sumE);
        System.out.println("Sum of Odd no: "+sumO);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OD(n);
    }
    
}
