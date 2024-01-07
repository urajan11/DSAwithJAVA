public class RECRSIONBASIC {
    // to print decresing order from 10
   /*   public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    
 */
    // To print incresing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        int n=10;
        //printDec(n);
        printInc(n);
    }
}
