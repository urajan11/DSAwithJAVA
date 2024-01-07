public class MLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
        }

        tail.next = newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

        Node getmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

        Node mergesort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //Mid
        Node mid= getmid(head);

        Node righthead= mid.next;
        mid.next = null;
        
        Node newleft = mergesort(head.next);
        Node newRight = mergesort(righthead);

        return merge(newleft, newRight);

    }

        Node merge(Node head1, Node head2){
        Node mergell=new Node(-1);
        Node temp = mergell;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while( head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while( head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return  mergell.next;
    }
    public static void main(String args[]){
        MLL ll= new MLL();
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.addLast(2);
        ll.print();
        ll.head = ll.mergesort(ll.head);
        ll.print();
    }
    
}
