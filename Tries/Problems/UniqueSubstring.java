public class UniqueSubstring 
{
    static class Node
    {
        Node children[] = new Node[26];
        boolean eow = false;
        Node()
        {
            for(int level=0;level<children.length;level++)
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

    public static int uniqueCount(Node root)
    {
        if( root == null)
        {
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i] != null)
            {
                count += uniqueCount(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String []args)    
    {
        String str = "apple";

        // sufffix insert in trie
        for(int i=0;i<str.length();i++)
        {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(str+" -> Total Unique Substring : "+uniqueCount(root));
    }
}
