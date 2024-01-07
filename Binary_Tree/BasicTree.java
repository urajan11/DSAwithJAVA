import java.util.*;

public class BasicTree 
{
    static class Node {
        int data;
        Node left, right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
    }
    } 
    public static void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(" " + node.data);
            traverseTree(node.right);
        }
    }
    public static void main(String [] args)
    {
        Node root =  new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        traverseTree(root);
    }
}
