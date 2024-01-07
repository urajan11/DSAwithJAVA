public class LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
        
        this.data=data;
        this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }    
    public void print(){
        Node  temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        LL l=new LL();
        l.addFirst(3);
        l.addLast(1);
        l.addLast(2);
        l.print();

    }
}
