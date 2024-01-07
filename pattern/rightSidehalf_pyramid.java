import java.util.*;;
public class rightSidehalf_pyramid {
    
    public static void main(String args[]){
        int r=4;
     //outeer loop 
     for(int i=1;i<=r;i++){
        // inner loop
        for(int j=1;j<=r-i;j++){
           
                System.out.print(" ");

        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();

        
     }
     
    
    }
}