import java.util.*;
public class HashMapImentation 
{
    static class HashMap<K,V> //generic - HashMap<Key, value> // any type of value is here
    {
        private class Node // Node have two value key and value
        {
            K key; // type of key
            V value;
            
            public Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n  // Total no. of Nodes
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.lenght   // actual HashMap
                                           // Array with dataType Linked List
        @SuppressWarnings("uncheked")  // Handle Warnig   // Optional depends of compailer version
        public HashMap()
        {
            this.N = 4; // size of array
            this.buckets = new LinkedList[4]; //created bucket with 4 index
            for(int i=0;i<4;i++)
            {
                this.buckets[i] = new LinkedList<>(); // creating empty Linked List by traveling each index
            }
        }
        private int hashFunction(K key)
        {
            int hc = key.hashCode(); // return the HashCode for any object in integer
            return Math.abs(hc) % N; // Absolute value
        }

        private int SearchInLL(K key, int bi) // to seach linke list
        {
            LinkedList<Node> ll = buckets[bi]; // stor at ll
            int di = 0;
            for(int i=0; i<ll.size();i++)
            {
                Node node = ll.get(i);
                if(node.key == key)
                {
                    return di;
                }
                di++;
            }
            return -1; // is not found
        } 
        //@SuppressWarnings("unchecked") // if give wny error
        private void rehash() // optimized data
        {
            LinkedList<Node> oldBuck[] = buckets; //LL store in old Bucket
            buckets = new LinkedList[N*2];  // New current buckect with double size
            N = 2*N;
            for(int i=0; i<buckets.length; i++)
            {
                buckets[i] = new LinkedList<>(); // initialize with emplty LL
            }

            // node -> add in new bucket
            for(int i=0; i<oldBuck.lenght;i++)
            {
                LinkedList<Node> ll = oldBuck[i] ;
                for(int j=0;i<ll.size();j++)
                {
                    Node node = ll.remove();
                    put(node.key , node.value); // put in new buckect
                }
            }
        }

        public void put(K key, V value) // TC = O(lambda) -> O(1)
        { 
            int bi = hashFunction(key); // return Bucket Index // between 0 - 3 for size of 4 LL
            int di = SearchInLL(key, bi) ;  // Data index // valid: -1 -> if not found
            
            if(di != -1) // if exit the data
            {
                Node node  = buckets[bi].get(di); // inside array index . at linked list
                node.value = value; // value find and update
            }
            else // if not found
            {
                buckets[bi].add(new Node(key, value));
                n++; // for adding new node
            }

            double lamda  =  (double)n/N;
            if(lamda > 2.0) // if lambda greater than Thrashold value
            {
                rehash();
            }
        }

        public boolean cantainsKey(K key)   // check exsitance
        {
            int bi = hashFunction(key); // return Bucket Index // between 0 - 3 for size of 4 LL
            int di = SearchInLL(key, bi);  // Data index // valid: -1 -> if not found

            if(di != -1) // if exit the data // valid
            {
                return true;
            }
            else // if not found // not vslid
            {
                return false;
            }
        }

        public  V remove(K key) 
        {
            int bi = hashFunction(key); // return Bucket Index // between 0 - 3 for size of 4 LL
            int di = SearchInLL(key, bi);  // Data index // valid: -1 -> if not found

            if(di != -1) // if exit the data
            {
                Node node  = buckets[bi].remove(di); // inside array index . at linked list
                n--;  
                return node.value;
            }
            else // if not found
            {
                return null;
            }
        }
        
        public V get(K key)
        {
            int bi = hashFunction(key); // return Bucket Index // between 0 - 3 for size of 4 LL
            int di = SearchInLL(key,bi);  // Data index // valid: -1 -> if not found

            if(di != -1) // if exit the data
            {
                Node node  = buckets[bi].get(di); // inside array index . at linked list
                return node.value ;
            }
            else // if not found
            {
                return null;
            }
        }
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++)
            {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) 
                {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty()
        {
            return n = 0;
        }
    }
    public static void main(String args[])
    {
        HashMap<String, Integer> hm = new HashMap<>(); // this is a user defind function
        hm.put("India" , 100);
        hm.put("Chaina", 150);
        hm.put("US", 50);
        hm.put("Japan", 20);
        hm.put("Nepal", 5);
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        // System.out.println(hm.get("India"));
        // System.out.println(hm.remove("India"));
        // System.out.println(hm.get("India"));
    }
}
