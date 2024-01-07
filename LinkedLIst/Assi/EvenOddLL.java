public class EvenOddLL {
    class Solution{
        Node head;
        class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        void segregateEvenOdd(){
            Node end = head;
            Node prev = null;
            Node curr = head;

            while(end.next != null){
                end = end.next;
                Node newEnd = end;

                while(curr.data %2 != 0 && curr != end){
                    newEnd.next = curr;
                    curr = curr.next;
                    newEnd.next.next = null;
                    newEnd = newEnd.next;
                    }
                    if(curr.data % 2 == 0){
                        head = curr;
                        while(curr != end){
                            if(curr.data % 2 == 0){
                                prev = curr;
                                curr = curr.next;
                            }
                            else{
                                prev.next = curr.next;
                                curr.next = null;
                                newEnd.next = curr;
                                newEnd = curr;
                                curr = prev.next;
                            }
                        }
                    }
                    else{
                        prev = curr;
                    }
                    if(newEnd != end && end.data %2 != 0){
                        prev.next = end.next;
                        end.next = null;
                        newEnd.next = end;
                    }
            }

        }
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

    }
    public static void main(String args[]){
        Solution ll = new Solution();
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.println("Linked List");
        ll.print();
        ll.segregateEvenOdd();
        System.out.println("Updated Linked List");
        ll.print();
    }
}
