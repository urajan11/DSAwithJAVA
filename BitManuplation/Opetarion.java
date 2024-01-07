public class Opetarion {
    public static int getithbit(int n, int i){
        int BitMask=1<<i;
        if((n & BitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int SetIthBit(int n, int i){
        int BitMask=1<<i;
        return n|BitMask;
    }
    public static int Clearithbit(int n,int i){
        int BitMask=~(1<<i);
        return n& BitMask;

    }
    public static int updateIthbit(int n, int i, int newBit ){
        /* if(newBit==0){
            return Clearithbit(n, i);
        }
        else{
            return SetIthBit(n, i);
        } */
        n=Clearithbit(n, i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }
    public static int clearIJbitsinRange(int n,int i, int j){
        int a=(~0)<<(j+1); //n=10 i=2, j=4
        int b=(1<<i)-1;   // 00001010
        int BitMask=a|b;  // result = 00000010 (2)
        return n& BitMask;
    }
    public static void main(String args[]){
      //System.out.println("Get iTH bit: "+ getithbit(10, 2));
      //System.out.println( "Set iTH bit: "+SetIthBit(10, 2));
      //System.out.println( "Clear iTH bit: "+Clearithbit(10, 1));
      //System.out.println( "Update iTH bit: "+updateIthbit(10, 2,1));
      System.out.println( "Clear iTH to jTH bit: "+clearIJbitsinRange(10, 2,4));
    }
    
}
