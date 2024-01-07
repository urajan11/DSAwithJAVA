public class DecresingPyramin {
    public static void main(String args[]){
        int r=10;
     //outeer loop 
     for(int i=1;i<=r;i++){
        // inner loop
        for(int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
         }
         System.out.println();// next line
        }
        
     }  
}
