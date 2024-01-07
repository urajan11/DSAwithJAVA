import java.util.*;

public class MaxSubArray {

    static void printMax(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
                dq.addLast(i);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeLast();
                dq.addLast(i);
            }
            System.out.print(arr[dq.peek()]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 1, 78, 90, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
