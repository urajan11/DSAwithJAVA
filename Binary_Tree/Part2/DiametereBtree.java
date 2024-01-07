import java.util.*;
public class DiametereBtree {
    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static int heigth(Node root){
            if(root == null){
                return 0;
            }
            int lh = heigth(root.left);
            int rh = heigth(root.right);
            int tot = Math.max(lh, rh)+1;
            return tot;
        }

        public static int Diameter(Node root){ // tc = O(n^2)
            if(root == null){
                return 0;
            }

            int ldia = Diameter(root.left);
            int lheight = heigth(root.left);

            int rdia = Diameter(root.right);
            int rheight = heigth(root.right);

            int selfdia = lheight + rheight +1;

            return Math.max(selfdia,Math.max(rdia, rdia));
        }

        static class Info{
            int diam;
            int ht;
            public Info(int diam , int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diametere1(Node root){
            if(root == null){
                return new Info(0, 0);
            }

            Info leftInfo = diametere1(root.left);
            Info rightInfo = diametere1(root.right);

            int diam =  Math.max(Math.max(leftInfo.diam, rightInfo.diam), (leftInfo.ht + rightInfo.ht +1));
            int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;
            return new Info(diam, ht);
        }

       

    public static void main(String args[]){
        /*          1
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
                
                //System.out.println("Heigth of Binary Tree =" + heigth(root));
               // System.out.println("Diameter of BTree = "+Diameter(root));
                System.out.println("Diametere1 : "+diametere1(root).diam);
    }
}
