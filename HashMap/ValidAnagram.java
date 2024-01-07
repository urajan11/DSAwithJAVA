import java.util.HashMap;
import java.util.*;


public class ValidAnagram 
{
    public static boolean isAnagram(String s , String t)
    {
        HashMap<Character , Integer> map = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }
        
        for(int i=0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            int sk = map.getOrDefault(ch, 0)+1;
            map.put(ch, sk);
            
        }

        for(int i=0; i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(map.get(i) != null)
            {
                if(map.get(ch) == 1)
                {
                    map.remove(ch);
                }
                else
                {
                    int tk = map.get(ch)-1; 
                    map.put(ch, tk );
                }
                
            }
            else
                {
                    return false;
                }
        }
        return map.isEmpty();
    }
    public static void main(String [] args)
    {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));
    }
}
