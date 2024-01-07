import java.util.*;
public class LinkedHashSets {
    public static void main(Strin [] args)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Nagpur");
        lhs.add("Pune");
        lhs.add("Tokyo");
        lhs.add("Khambi");

        System.out.println(lhs);

        lhs.remove("Nagpur");
        System.out.println(lhs);
    }
}
