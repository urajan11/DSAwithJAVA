public class SwapNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class Solution{
        Node head;
        public void Nodeswap(int x, int y){
            if(x==y){
                return;
            }
                Node prevX = null, currX = head;
                while(currX != null && currX.data != x){
                    prevX = currX;
                    currX = currX.next;
                }
                Node prevY = null, currY = head;
                while(currY != null && currY.data != y){
                    prevY = currY;
                    currY = currY.next;
                }
                if(currX == null || currY == null){
                    return;
                }
                if(prevX != null){
                    prevX.next  = currY;
                }
                else{
                    head =currY;
                }
                if(prevY != null){
                    prevY.next = currX;
                }
                else{
                    head = currX;
                }
                Node temp = currX.next;
                currX.next = currY.next;
                currY.next = temp;
        }
        public void push(int newdata){
            Node newNode = new Node(newdata);
            newNode.next = head;
            head = newNode;
        }
        public void print(){
            Node tem = head;
            while(tem != null){
                System.out.print(tem.data+ " ");
                tem=tem.next;
            }
            System.out.println("null");
        }
    }

    public static void main ( String args[]){
        Solution ll =new Solution();
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.print("\n linkedList before");
        ll.print();
        ll.Nodeswap(4, 3);
        System.out.print("\n linkedList After swap");
        ll.print();

    }
}
