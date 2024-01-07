import javax.swing.plaf.synth.SynthStyle;

public class Rhombus {
    public static void Roh(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars -i
            for(int j=1;j<=n;j++){
                System.out.print("*");
                /* if(i==1 || i==n || j==1 || j==n){
                 System.out.print("*");
                }
                else{
             System.out.print(" "); // hollow part
                } */
            }
            System.out.println();
        }
    }
    public static void main(String atgs[]){

        Roh(5);
    }
    
}
