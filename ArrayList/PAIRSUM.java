import java.util.ArrayList;

public class PAIRSUM {
    //Brute Force - TC=O(2^n)
    /* public static boolean pairsSum(ArrayList<Integer>list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    } */

    //2 pointer approch
    //TC=O(n)
    public static boolean pairsSum(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(list.get(lp)!=list.get(rp)){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println( pairsSum(list, 10));
    }
}
