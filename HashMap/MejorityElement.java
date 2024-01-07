import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class MejorityElement {
    
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {1,3,2,5,1,3,1,5};

        for(int i=0;i<arr.length;i++)
        {
            // if(map.containsKey(arr[i]))
            // {
            //     int k =  map.get(arr[i]);
            //     map.put(arr[i], k+1);
            // }
            // else
            // {
            //     map.put(arr[i], 1);
            // }
            int k = map.getOrDefault(arr[i], 0)+1;
            map.put(arr[i], k);

        }

        // Set<Integer> keySet = map.keySet();
        for (Integer key : map.keySet()) // Advance for loop
        {
            if (map.get(key) > arr.length / 3) 
            {
                System.out.println(key);
            }
        }
    }
}
