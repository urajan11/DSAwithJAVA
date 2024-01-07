import java.util.*;
public class leapyeatr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the year:");
        int y=sc.nextInt();// enter year
        
        /* if((y%4)==0){
            System.out.println("leap Year");
        }
        else if((y%100)==0){
            System.out.println("leap Year");
        }
        else if((y%400)==0){
            System.out.println("leap Year");
        }
        else{
            System.out.println("Not leap year");
        } */
        boolean x=(y % 4)==0;
        boolean t=(y%100)!=0;
        boolean z=(y%100==0) && (y%400==0);
        if (x && (t||z)){
            System.out.println(y+"\t is a leap year");
        }else{
            System.out.println(y+" \t is not a leap year");
        }
    }
    
}
