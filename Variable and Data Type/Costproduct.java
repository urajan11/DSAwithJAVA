import java.util.*;
public class Costproduct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float tot=pen+pencil+eraser;
        float GST=tot*0.18f;
        float Total=GST+tot;
        System.out.println("Cost Price Product with GST(18%)");
        System.out.println(Total);
    }
    
}
