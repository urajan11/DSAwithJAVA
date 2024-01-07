public class MirrorBTS {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data  = data;
        }
    }

    public static Node CurrentMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = CurrentMirror(root.left);
        Node rightMirror = CurrentMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder( Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        /*          8
         *        /   \
         *       5      10
         *      / \       \
         *     3   6       11
         */
        root = CurrentMirror(root);
        preorder(root);
         /*         8
         *        /   \
         *       10     5
         *      /      / \
         *     11      6  3
         */
    }
    
}
