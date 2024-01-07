public class FRIENDSPIRE { //DSA Goldman Sachs
    public static  int PairFriend(int n){
        //Base case
        if(n==1 ||n==2){
            return n;
        }
        return PairFriend(n-1)+(n-1)*PairFriend(n-2);//single choice+ pair choice
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(PairFriend(n));
    }
    
}
