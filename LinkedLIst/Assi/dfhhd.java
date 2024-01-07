public class dfhhd {
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static Node head;
    void push(int newdata){
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }
    void print(){
        Node tem = head;
        while(tem != null){
            System.out.print(tem.data+ " ");
            tem=tem.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        dfhhd ll = new dfhhd();
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.println("Linked List");
        ll.print();
    }
}
