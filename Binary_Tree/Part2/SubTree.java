import java.util.*;
public class SubTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null;
        }
    }
        public static boolean IsIdentical(Node node, Node subroot){
            if(node == null && subroot == null){
                return true;
            }
            else if(node == null || subroot == null || node.data != subroot.data){
                return false;
            }
            if(!IsIdentical(node.left ,subroot.left)){
                return false;
            }
            if(!IsIdentical(node.right, subroot.right)){
                return false;
            }
            return true;
        }


        public static boolean isSubTree(Node root , Node subroot){
            if(root == null){
                return false;
            }
            if(root.data == subroot.data){
                if(IsIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }
    public static void main(String args[]){
        Node root = new Node (1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node SubTrees = new Node(2);
        SubTrees.left = new Node(4);
        SubTrees.right = new Node(5);
        
        System.out.println(isSubTree(root,SubTrees));
    }
}
