public class Pallindrome {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(char data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        stack s = new stack();
        s.push('a');

        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }

    }
}
