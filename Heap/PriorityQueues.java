import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueues {
    public static void main(String args[]){
       // PriorityQueue<Integer>pq = new PriorityQueue<>();// Asscending Order
       PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder()); // Dessending Order
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); 
            pq.remove();
        }

    }

}
