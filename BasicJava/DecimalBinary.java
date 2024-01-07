import java.util.*;
public class DecimalBinary {
    public static void DecBin(int n){
    int rem=0;
    int bin=0;
    int pow=0;
    while(n>0){
        rem=n%2;// take remainder
        bin=bin+(rem*(int)Math.pow(10,pow)); //Binary conversion
        pow++;
        n=n/2;

    }
    System.out.println(bin);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        DecBin(n);

    }
}
