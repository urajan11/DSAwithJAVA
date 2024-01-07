import java.util.*;

public class PallindromeLL {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPallindrome(Node head) {
        Node slow = head;
        boolean isPalli = true;
        Stack<Integer> s = new Stack<>();

        while (Slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                isPalli = true;
            } else {
                isPalli = false;
                break;
            }
            head = head.next;
        }
        return isPalli;
    }

    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(1);
        one.next = two;
        two.next = three;
        boolean cond = isPallindrome(one);
        System.out.println("Pallindrom : " + cond);
    }
}
