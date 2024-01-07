public class pyramid {
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            //space
            for (int j=1;j<=3-i;j++)
            {
                System.out.print(" ");
            }
            //decending
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();


        }
    }
    
}
