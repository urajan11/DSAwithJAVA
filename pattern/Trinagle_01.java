public class Trinagle_01 {
    public static void main(String args[]){
        int n=5;
        //outer loop for no of lines
        for(int i=1;i<=n;i++){
            //inner loop 
            for(int j=1;j<=i;j++){
                int x=i+j;
                if(x%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                } 
            }
            System.out.println();// new line
        }
    }
    
}
