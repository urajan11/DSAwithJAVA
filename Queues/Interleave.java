import java.util.*;

public class Interleave {

    public static void InterleaveTwoQ(Queue<Integer> q) {
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size() / 2;
        for (int i = 0; i < size; i++) {
            firsthalf.add(q.remove());
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);s
        q.add(4);
        InterleaveTwoQ(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
