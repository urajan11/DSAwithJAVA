import java.util.ArrayList;

public class MONOTONICARRALIST {
    public static boolean monotonic(ArrayList<Integer>list){
        if(list.get(0)<=list.get(1)){
            System.out.print("monotonically increasing :");
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++)
            if(list.get(i)>list.get(j)){
                return false ;
            }
        }
    }
    else{
        System.out.print("Monotonically decreasing: ");
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++)
            if(list.get(i)<list.get(j)){
                return false ;
            }
        }
    }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(monotonic(list));
    }
    
}
