import java.util.*;
public class Table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// Accept value from user
       /*  for(int i=1;i<=10;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();

        }
         */
        int i=1;
        while(i<=10){
            
            System.out.print(i*n+" ");
            i++;
        }
    }

    
}
