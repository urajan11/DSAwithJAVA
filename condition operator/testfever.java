import java.util.Scanner;

public class testfever {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature in fahrenheit:");
        double t=sc.nextDouble();
        if(t>100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("your Fine");
        }
    }
    
}
