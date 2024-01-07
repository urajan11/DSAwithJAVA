import java.util.*;
public class RangeSumBST {
    static class Node {
        int data;
        Node left;
        Node  right;
    }
    static Node newNode(int item){
            Node temp = new Node();
            temp.data = item;
            temp.left = temp.right = null;
            return temp;
    }
    public static int sum=0;
    public static int RangeSum(Node root, int low, int high){
    
        if(root == null)
            return 0;
    
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty() == false){
            Node curr = q.peek();
            q.remove();
            if(curr.data >= low && curr.data <= high){
                sum += curr.data;
            }
            if(curr.left != null && curr.data > low)
                q.add(curr.left);
            if(curr.right != null && curr.data < high)
                q.add(curr.right);
        }
        return sum;

}
public static Node insert(Node node, int val){
    if(node == null)
        return newNode(val);
    if(val <= node.data)
        node.left  = insert(node.left, val);
    else
        node.right = insert(node.right, val);
    return node;
}
    public static void main(String args[])
    {
        Node root = null;
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);
        int L = 7;
        int R = 15;

        System.out.print("Sum :"+ RangeSum(root,L,R));
    }
}
