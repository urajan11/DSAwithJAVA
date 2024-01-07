import java.util.*;

public class QueueReverse {
    public static void Reverse(Queue<Integer> q) {

        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove()); // remove el from queue and add to stack
        }

        while (!s.isEmpty()) {
            q.add(s.pop()); // remove el from stack and add to queue
                            // reverse order
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        Reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
