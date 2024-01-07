import java.util.*;
public class removeOn {
    static class Queue {
        
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Add
        public static void add(int data) {
            
            if(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            else{
                s1.push(data);
            }
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty ");
                return -1;
            }
            int last = -1;
            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    last= s1.pop();
                    if(s1.isEmpty()){
                        break;
                    }
                    s2.push(last);
                }
            }
            else{
                while(!s2.isEmpty()){
                    last = s2.pop();
                    if(s2.isEmpty()){
                        break;
                    }
                    s1.push(last);
                }
            }
            return s1.push(last);
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty 1");
                return -1;
            }
            int last = -1;
            if(!s1.isEmpty()){
                while(!s1.isEmpty()){
                    last = s1.pop();
                    s2.push(last);
                }
            }
            else{
                while(!s2.isEmpty()){
                    last = s2.pop();
                    s1.push(last);
                }
            }
            return s1.push(last);
        }

    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.print("Queue End");
    }
    
}
