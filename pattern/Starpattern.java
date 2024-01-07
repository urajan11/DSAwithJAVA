import java.util.*;
public class Starpattern {
    public static void main(String args[]){
        int n=5; // Accept no of lines
        
        /* for(int line=1;line<=n;line++) //outer loop
        {
           // inner loop
           for(int s=1;s<=line;s++){
            System.out.print("* "); //Right angle triangle patter
           }
           System.out.println();
        }
 */
//inverted - Star pattern
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
}
