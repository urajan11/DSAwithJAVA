public class Floyds_Trinangle {
    public static void main(String args[]){
        int n=5;
        int counter=1;
        //outer loop for no of lines
        for(int i=1;i<=n;i++){
            //inner loop 
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++; //
            }
            System.out.println();// new line
        }
    }
    
}
