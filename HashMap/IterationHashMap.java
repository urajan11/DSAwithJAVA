import java.util.*;
import java.util.HashMap;
public class IterationHashMap 
{
    public static void main(String raj[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);
        hm.put("Indonesia",6);
        // Iteration
        Set <String> keys = hm.keySet();
        System.out.println(keys);
        for(String k:keys)
        {
            System.out.println("Key = "+k+", value = "+hm.get(k));
        }
    }
}
