import java.util.*;
public class produt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       // int a=sc.nextInt();//Acceptin valu a
        //int b=sc.nextInt();//Accepting valu b
       // float product=a*b*d;
       //System.out.println(product); // Display product of 2 no
       float pi=3.14f;
       System.out.println("Enter Radius value");
       float r=sc.nextFloat();
       float area=pi*r*r; //Accepting radius value 
       System.out.print("Area of circle=");
       System.out.println(area);

    }
    
}
