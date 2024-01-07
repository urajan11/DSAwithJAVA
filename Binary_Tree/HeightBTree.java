import java.util.*;

public class HeightBTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heigth(Node root) {
        if (root == null) {
            return 0;
        }
        int hl = heigth(root.left);
        int hr = heigth(root.right);
        return Math.max(hl, hr) + 1;
    }
    public static int  count(Node root) {
        if(root == null){
            return 0;
        }
        int Lcount = count(root.left);
        int Rcount = count(root.right);
        int Total = Lcount+Rcount+1;
        return Total;

    }
    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
        int Lsum = Sum(root.left);
        int Rsum = Sum(root.right);
        int Total = Lsum+Rsum+root.data;
        return Total;
    }

    public static void main(String args[]) {
          /*        1
                   / \
                  2   3
                 / \   \
                4  5   6  */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println("Heigth of Binary Tree =" + heigth(root));
        System.out.println("Total node of Tree : "+ count(root));
        System.out.println("Total sum node of Tree : "+ Sum(root));
    }
}
