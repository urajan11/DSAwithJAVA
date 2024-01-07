import java.util.*;
public class average {
    public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.print("Input the first no: ");
    double x=sc.nextDouble();
    System.out.print("Input 2 nd no: ");
    double y=sc.nextDouble();
    System.out.print("Input the 3rd no: ");
    double z=sc.nextDouble();
    System.out.print("The average value is "+avg(x,y,z)+"\n");

 }
 public static  double avg(double x, double y, double z){
    return (x+y+z)/3;
 }

    
}
