import java.util.*;

public class BTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node BuildTree(int nodes[]) { // return root node
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;

        }
        //Preorder
        public static void PreOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
        //Inorder
        public static void InOreder(Node root) {
            if (root == null) {
                return;
            }

            InOreder(root.left);
            System.out.print(root.data + " ");
            InOreder(root.right);
        }
        //Postorder
        public static void PostOreder(Node root) {
            if (root == null) {
                return;
            }

            PostOreder(root.left);
            PostOreder(root.right);
            System.out.print(root.data + " ");
        }

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("root Node: "+root.data);
        
        tree.PreOrder(root);
        System.out.println();
        tree.InOreder(root);
        System.out.println();
        tree.PostOreder(root);
    }
}