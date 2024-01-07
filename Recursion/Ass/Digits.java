public class Digits {
    static String digit[]={"zero","one","two","three","four",
                            "five","six","seven","eight","nine"};
    public static void printDigits(int num){
        if(num==0){
            return;
        }
        int lastDigit=num%10;
        printDigits(num/10);
        System.out.print(digit[lastDigit]+" ");
    }
    public static void main(String args[]){
        printDigits(1997);
        System.out.println();
    }
    
}
