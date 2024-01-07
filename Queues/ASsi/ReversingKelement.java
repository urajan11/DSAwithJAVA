import java.util.*;

public class ReversingKelement {

    public static void ReverseFirstHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            s.push(q.remove());
            
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < size / 2; i++) {
            q.add(q.peek());
            q.remove();
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        ReverseFirstHalf(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
