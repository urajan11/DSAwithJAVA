import java.net.CookieHandler;
import java.util.Currency;

public class WordBreak {

    static class Node{

        Node []children = new Node[26];
        boolean eow = false;
        Node()
        {
            for(int level=0;level<26;level++)
            {
                children[level] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String words)
    {
        Node curr = root;
        for(int i=0;i<words.length();i++)
        {
            int idx = words.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }


    public static boolean search(String key)
    {
        Node curr = root;

        for(int level =0 ;level < key.length();level++)
        {
            int idx =key.charAt(level) - 'a';

            if(curr.children[idx] == null)
            {
                return false;
            }
            curr = curr.children[idx];
        }        
        return curr.eow == true;
    }

    public static boolean breakWord(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }

        for(int i=1;i<=key.length();i++)
        {
            if(search(key.substring(0,i)) && breakWord(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args)
    {
        String words[] = {"i","like","sam","samsung","mobile","ice"};
        String key = "ilikesamsamsung";

        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(breakWord(key));
    }
    
}
