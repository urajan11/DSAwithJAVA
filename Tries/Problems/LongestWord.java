//  Longest word with all prefixes

public class LongestWord 
{
    static class Node
    {
        Node child[] = new Node[26];
        boolean eow = false;

        Node()
        {
            for(int level=0;level<26;level++)
            {
                child[level] = null;
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
            if(curr.child[idx] == null)
            {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void logestPrefixWord(Node root, StringBuilder temp)
    {
        if(root == null)
        {
            return;
        }

        for(int i=0;i<26;i++)
        {
            if(root.child[i] != null && root.child[i].eow == true)
            {
                char ch =(char)(i+'a');
                temp.append(ch);
                // System.out.println(">>>"+temp.append(ch));

                if(temp.length() > ans.length())
                {
                    ans = temp.toString();
                    // System.out.println("---"+ans);
                }
                logestPrefixWord(root.child[i], temp);
                temp.deleteCharAt(temp.length() - 1); // back Track
            }
        }
    }
    public static void main(String [] args)
    {
        String words[] = {"a","banana","apply","appl","app","ap","apple"};

        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        logestPrefixWord(root, new StringBuilder(""));
        System.out.println(ans);
    }    
}
