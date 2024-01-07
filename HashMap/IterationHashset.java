import java.util.*;
public class IterationHashset {
    public static void main(String [] args)
    {
    HashSet<String> ct = new HashSet<>();

    ct.add("Khambi");
    ct.add("Nagpur");
    ct.add("Pune");
    ct.add("Tokyo");

    // Iterator it = ct.iterator();
    // while(it.hasNext())
    // {
    //     System.out.println(it.next());
    // }

    for(String city : ct)
    {
        System.out.println(city);
    }

    }
}
