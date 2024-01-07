public class YshapedLL {
    public class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public node getIntersectionNode(node head1, node head2) {
        while (head2 != null) {
            
            while (head1 != null) {
                if (head1 == head2) {
                    return head2;
                }
                head1 = head1.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String args[]) {
        YshapedLL Yll = new YshapedLL();

        node head1, head2;
        head1 = new node(10);
        head2 = new node(3);
        node newnode = new node(6);
        head2.next = newnode;

        newnode = new node(9);
        head2.next.next = newnode;

        newnode = new node(15);
        head1.next = newnode;
        head2.next.next.next = newnode;

        newnode = new node(30);
        head1.next.next = newnode;

        head1.next.next.next = null;

        node intersectionPoint = Yll.getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.print("No Intersection point \n");
        } else {
            System.out.print("Intersection point. " + intersectionPoint.data);
        }
    }
}
