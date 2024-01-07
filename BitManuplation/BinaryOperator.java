import java.util.*;
public class BinaryOperator {
    public static void main(String args[]){
        System.out.println(5&6);// 5+6=4(100)
        System.out.println(5|6);//5+6=7(111) OR operator
        System.out.println(5^6);// 5^6=3(11) XOR operator
        System.out.println((~0));// 1's complement
        System.out.println(5<<2);// left Shift{ A=000101 ls(2) A=010100}
        // a<<b =a*2^b 
        System.out.println(6>>1);// Right Shift{ A=000110} Rs(1) A=000011            
        // a>>b=a/2^b
    }
}
