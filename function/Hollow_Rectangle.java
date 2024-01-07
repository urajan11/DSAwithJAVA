import java.util.*;
public class Hollow_Rectangle {
    public static void Hollow(int row, int col){
        //outeer loop 
        for(int i=1;i<=row;i++){
            // inner loop
            for(int j=1;j<=col;j++){
                //cell-(i,j)
                if(i==1 || i==row || j==1 || j==col){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        Hollow(row,col);
    }
    
}
