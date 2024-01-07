public class RecursiveSearch {
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
    
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int resSearch(int key){//TC = O(n)
        return helper(head, key);
    }

    public static void main(String args[]) {
        RecursiveSearch ll= new RecursiveSearch();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addLast(6);
        ll.Printll();
        System.out.println(ll.resSearch(1));
        System.out.println(ll.resSearch(50));
        
    }
}
