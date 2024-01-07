import java.util.HashSet;
public class HashSetEx 
{
    public static void main(String [] args)
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        System.out.println(set.size());
        if(set.contains(2))
            System.out.println("contain 2");
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }    
}
