public class CheckPallindrome {
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
        
        //Slow - Fast approch
        public Node midFind(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            return slow;
        }
        public boolean CheckPali(){
            if(head==null || head.next==null){
                return true;
            }
            //step 1 - Find mid
            Node mideNode=midFind(head);

            //step 2 - revers 2 nd half
            Node prev=null;
            Node curr=mideNode;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;// right half
            Node left=head;

            // step 3 - check legt half and right half
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;

        }
    
        public static void main(String args[]) {
            CheckPallindrome ll=new CheckPallindrome();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(2);
            ll.addLast(1);
            ll.Printll();
            System.out.println(ll.CheckPali());
        }
    
}