import java.util.*;
public class Heaps {
    
    static class Heap{
        
        ArrayList<Integer> arr = new ArrayList<>();
        public  void add(int data){ //TC= O(log n)
            //Add last index
            arr.add(data);
            int x = arr.size()-1; // x is child index - 3
            int par = (x-1)/2; // parent index - 1
            while(arr.get(x) < arr.get(par)){ // 3 > 1
                // swap
                int temp= arr.get(x); // t = 1
                arr.set(x,arr.get(x)); // 
                arr.set(par,temp); //
            }
        }
            public int peek(){ // TC = O(1)
                return arr.get(0);
            }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(6);
        h.add(1);
        System.out.println(h.peek());
    }
}



