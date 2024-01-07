
import java.util.*;
public class DeleteNafterMNodes {
    public class node {
        int data;
        node next;
    }

    

    static node push(node ref , int newdata) {
        node newnode = new node();
        newnode.data = newdata;
        newnode.next = ref;
        ref = newnode;
        return ref;
    }

    static void print(node head) {
        while (head != null) {
            System.out.prinf("%d",head.data);
            head = head.next;
        }
        System.out.printf("\n");
    }
    
    static void skipMdeletedN(node head, int M, int N){
        node curr = head,t;
        int count;
        while(curr != null){
            for(count=1; count<M && curr != null; count++){
                curr=curr.next;

                if(curr == null)
                    return;
                t = curr.next;
        }
                for(count =1 ; count<= N && t != null; count++){
                    node temp= tail;
                    t =tail.next;
                }
                curr.next = t;
                curr = t;
            
        }
    }
    

    public static void main(String args[]) {
             node head = null;
        int M=2, N=3;
        head=push(head, 10);
        head=push(head, 9);
        head=push(head, 8);
        head=push(head, 7);
        head=push(head, 6);
        head=push(head, 5);
        head=push(head, 4);
        
        System.out.printf("M = %d , N =%d \n"+ "LinkedList we have is:\n", M, N );
        print(head);
        skipMdeletedN(head, M, N);
        System.out.printf("\n LinkedList on deletion id :\n");
        print(head);
    }
    
}
