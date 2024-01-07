import java.util.*;
public class TreeSets {
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();

        set.add("Nagpur");
        set.add("Pune");
        set.add("Tokyo");
        set.add("Khambi");
        System.out.println(set);

        // LinkedHashSet<String> ls = new LinkedHashSet<>();
        // ls.add("Nagpur");
        // ls.add("Pune");
        // ls.add("Tokyo");
        // ls.add("Khambi");

        // System.out.println(ls);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Nagpur");
        ts.add("Pune");
        ts.add("Tokyo");
        ts.add("Khambi");
        System.out.println(ts);
    }
}
