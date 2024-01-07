public class DoublyLinkedList {
    
    public class Node{
        int data;
        Node next;
        Node prev;
        public  Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head== null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail = newNode;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("List is null");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public int  removeLast(){
        if(size == 0)
        {
            System.out.println("List is null");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        
    }
}
