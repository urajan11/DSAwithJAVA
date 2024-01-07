public class rverse {
    public static void main(String args[]){
        /* int a=108;
         while(a>0){
            int lastn=a%10;
            System.out.print(lastn);
            a=a/10;
         }*/
         
             
            int n=102458;
            int rev=0;
            while(n>0){
                int last=n%10;
                rev=(rev*10)+last;
                System.out.print(rev+" ");
                n=n/10;
            }
            System.out.println("="+rev);

        }
       
    }
    

