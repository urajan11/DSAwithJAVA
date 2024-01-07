import java.util.*;
public class StroreBinary {
    public static void BinaryElement(int num){
        
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while(num>0){
            String s1 =q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2 =  s1;
            q.add(s1+"0");
            q.add(s2+"1");
            num--;
            
        }
        
        
    }
    public static void main(String args[]){
        int num = 10;
        BinaryElement(num);
    }
}
