import java.util.*;
public class OddEven {
    public static void main(String args[]){
        int n=6;
        int bitMask=1;
        // even number
        if((n & bitMask)==0){
            System.out.println("Even No");
        }
         else{
            System.out.println("Odd No");
         }
    }
}
