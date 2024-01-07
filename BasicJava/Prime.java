import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no.: ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("is prime");
        }
        if (n == 2) {
            System.out.print(n + " is prime");
        } else {
            // boolean isPrime=true;
            // for (int i = 2; i <= Math.sqrt(n); i++)// This condition for fast clculation
            // for
            // large no
            for (int i = 2; i <= n - 1; i++)// This condition for small no
            {
                if (n % i == 0)// n is a multiple of i(i not equal to 1 or n)
                {
                    // isPrime=false;
                    System.out.println(n + " is not prime");
                    break;
                } else {
                    System.out.println(n + " is prime");
                    break;
                }
            }

            /*
             * if(isPrime==true){
             * System.out.println(n+" is prime");
             * }else{
             * System.out.println(n+" is not prime");
             * }
             */
        }
    }

}
