public class ReversedLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    

    public void addFirst(int data) { // TC=O(1)

        Node newNode = new Node(data);
        
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {// TC=O(1)
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void Printll() {// tc=O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reversed(){
        Node prev=null;
        Node curr=tail=head; // java assined right to left
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]) {
        ReversedLL ll=new ReversedLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.Printll();
        ll.reversed();
        ll.Printll();
        
    }
}
