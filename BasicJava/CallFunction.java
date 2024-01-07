import java.util.*;
public class CallFunction {
    //public static void call()
    public static int call()
    {
        System.out.println("Hello Rajan");
        System.out.println("Hello Urkude");
        return 2;
    }
    public static void Calculatesum(int a, int b){
        /* Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); */
        int sum=a+b;
        System.out.println("sum is :"+ sum);

    }
    public static void main(String args[]){
        //call();//Function call
        Calculatesum(4,5);
    }
    
}
