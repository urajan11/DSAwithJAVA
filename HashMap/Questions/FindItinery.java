import java.util.*;
public class FindItinery 
{

    public static String getStart(HashMap<String,String> from )
    {
        HashMap<String, String> to = new HashMap<>();
        for(String key : from.keySet())
        {
            to.put(from.get(key), key);
        }

        for(String key : from.keySet())
        {
            if(!to.containsKey(key))
            {
                return key; //Starting point
            }
        }

        return null;
    }
    public static void main(String[] args) 
    {   // TC =O(n)
        HashMap<String, String> from = new HashMap<>();
        

        from.put("Chennai","Bengaluru");       
        from.put("Mumbai","Delhi");
        from.put("Goa","Chennai");
        from.put("Delhi","Goa");

        System.out.println(from);

        String start = getStart(from);
        System.out.print(start);

        for(String key:from.keySet())
        {
            System.out.print(" -> "+ from.get(start));
            start = from.get(start);
        }
        System.out.println();
    }
}
