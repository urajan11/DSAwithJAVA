import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.lang.*;
public class Kruskal 
{
    static class Edge implements Comparable<Edge>
    {
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w) 
        {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        @Override
        public int compareTo(Edge e2)
        {
            return this.wt - e2.wt; // sort in ascending order
        }
    }
    public static void createGraph(ArrayList<Edge>edge)
    {
        edge.add(new Edge(0, 1, 10));
        edge.add(new Edge(0, 2, 20));
        edge.add(new Edge(0, 3, 30));
        edge.add(new Edge(1, 3, 40));
        edge.add(new Edge(2, 3, 50));
    }
    static int n=4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init()
    {
        for(int i=0;i<n;i++)
        {
            par[i] = i;
        }
    }

    public static int find(int x)
    {
        if(par[x] == x)
        {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB])
        {
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB])
        {
            par[parA] = parB;
        }
        else 
        {
            par[parB] = parA;
        }
    }

    public static void kruskalMST(ArrayList<Edge>edge, int v)
    {
        init();
        Collection.sort(edge);
        int mstCost = 0;
        int count = 0;

        for(int i=0; count<v-1;i++)
        {
            Edge e = edge.get(i);

            // (src, dest, wt)
            int parA = find(e.src); // src =a
            int parB = find(e.dest); // dest = d
            if(parA != parB)
            {
                union(e.src, e.dest);
                mstCost +=  e.wt;
                count++;
            }
            System.out.println(mstCost);
        }
    }
    public static void main(String [] args)
    {
        int v = 4;
        ArrayList<Edge> edge = new ArrayList<>();
        createGraph(edge);
        kruskalMST(edge);
    }
} 
