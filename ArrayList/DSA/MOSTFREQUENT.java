import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class MOSTFREQUENT {
    public static int Frequent(ArrayList<Integer> list, int target) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(target) == list.get(i)) {
                count++;
            }

        }
        if(count>=2){
            System.out.println(list.get(target));
        }
        else{
            System.out.println("all elements are single");
        }
        return count;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(10);
        int target = 1;
        Frequent(list, target);
    }

}
