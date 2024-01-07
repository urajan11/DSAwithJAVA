import java.util.*;
public class Square {
    public static void squ(int r){//Accept row vlaue
        // loop to iterate for the row
     for(int i=1;i<=r;i++){
        //loop to print the star
        for(int j=1;j<=r;j++){
            System.out.print("*");//square pattern
        }
        System.out.println(); // for new line
     }
    
    }
   
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        squ(r);
    }
    
}
