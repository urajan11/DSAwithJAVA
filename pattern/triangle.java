import java.util.*;
public class triangle {
    public static void tri(int r){//Accept row vlaue
        // loop to iterate for the row
     for(int i=1;i<=r;i++){
        //loop to print the no of space
        for(int j=r;j>=i;j--){
            System.out.print(" ");
        }
        // loop to print the no. of stars
        for(int j=1;j<=i;j++){
            System.out.print(j+" "); // for star input with single space
        }
        System.out.println();//new line

     }
    }
   
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        tri(r);
    }
    
}