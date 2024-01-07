public class Dimond {
    public static void dia(int n){
       //outter loop
       for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars -i
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
            // invet pattern
         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        } 
        
     }
    
    public static void main(String args[]){
        dia(3);
    }
    
}
