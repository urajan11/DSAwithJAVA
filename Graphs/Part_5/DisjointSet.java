public class DisjointSet 
{

    static int n = 7;
    static int par[] = new int[n]; // static - array direct used to program
    static int rank[] = new int[n];

    public static void init()
    {
        for(int i=0;i<n;i++)
        {
            par[i] = i; // self parent
        }
    }

    public static int find(int x) // to find final parent
    {
        if(x == par[x])
        {
            return x;
        }

        return par[x] = find(par[x]); // optimization - path compretion
    }

    public static void union(int a, int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB])
        {
            par[parB] = par[parA]; // parB connect to parA
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB])
        {
            par[parA] = parB; // parA connect to parB
        }
        else
        {
            par[parB] = parA; 
        }
    }

    

    public static void main(String [] args)
    {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);

        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);

    }
}
