public class ZigZag {

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

    public void addLast(int data) { // TC=O(1)

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
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

    public void zigZAG(){
        // find mid
        Node slow= head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
         //revers 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node rigth= prev;
        Node nextl, nextr;

        //Zig Zag
        while(left !=null && rigth != null){
            nextl=left.next;
            left.next=rigth;
            nextr=rigth.next;
            rigth.next=nextl;

            left=nextl;
            rigth=nextr;
        }
    }

    public static void main(String args[]){
        ZigZag ll=new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.Printll();
        ll.zigZAG();
        ll.Printll();
    }
    
}
