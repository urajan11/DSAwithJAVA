public class Binomialcoeficient {
    public static int fact(int n){
        int f=1;
       
        for (int i=1;i<=n;i++){
            f=f*i;
          }
        return f;// Factorial of n
        
    }
    public static int biocoeff(int n, int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int biocoeff=fact_n/(fact_r*fact_nmr);
        return biocoeff;
    }
    public static void main (String args[]){
        System.out.println(biocoeff(5,2));
    }
    
}
