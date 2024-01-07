import java.util.HashMap;
import java.util.*;
public class BasicHashMap 
{
    public static void main(String args[])
    {
        // create HashMap 
        HashMap hm= new HashMap<>();
        // all operations [ TC= O(1) ]
        // insert data
        // put(key, value)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        // Print HashMap
        System.out.println(hm);

        //Get 
        // get(key)
        //int population = hm.get("India"); // erorr " cannot convert from Object to int "
        int population = (int) hm.get("India"); // Method of convert obj to int
        System.out.println(population); // give value of  Key 
        System.out.println(hm.get("Indonesia")); // gives null value Because Key not present in the map

        // containsKey()
        System.out.println(hm.containsKey("India")); // Gives true -> key is present in  map
        System.out.println(hm.containsKey("Nepal")); // Gives false -> key is not present in  map

        // remove();
        System.out.println(hm.remove("China")); // Gives remove key data int output
        System.out.println(hm.remove("Nepal")); // Gives null result

        // isEmpty();
        System.out.println(hm.isEmpty());// Gives -> false

        // clear();
        hm.clear();// Clear all data from Map
        System.out.println(hm.isEmpty()); // Gives -> True
    }
}
