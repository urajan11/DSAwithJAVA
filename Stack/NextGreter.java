import java.util.*;

public class NextGreter {
    public static void main(String args[]) {
        int arr[] = { 5, 8, 9, 2, 0, 1 };
        Stack<Integer> s = new Stack<>();
        int nxtGreter[] = new int[arr.length];
        for (int i = arr.length - 1; i <= 0; i--) {
            // while 1

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            // 2 if- else
            if (s.isEmpty()) {
                nxtGreter[i] = -1;
            } else {
                nxtGreter[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i);
        }
        for (int i = 0; i < nxtGreter.length; i++) {
            System.out.print(nxtGreter[i] + " ");
        }
        System.out.println();
    }

}
// next greter Right
// for (int i = arr.length - 1; i <= 0; i--)

// next Greter left
// for (int i = 0; i <arr.lenght; i++)

// next smaller right
// while (!s.isEmpty() && arr[s.peek()] >= arr[i])

// next smaller left
// for (int i = 0; i <arr.lenght; i++)
// while (!s.isEmpty() && arr[s.peek()] >= arr[i])
