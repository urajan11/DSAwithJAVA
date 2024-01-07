import java.util.ArrayList;
import java.util.*;
public class BellmanFord 
{

    static class Edge
    {
        int src, dest, wt;

        Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[]graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }

        // vertex - 0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // vertex - 1
        graph[1].add(new Edge(1, 2, -4));
        

        // vertex - 2
        graph[2].add(new Edge(2, 3, 2));

        // vertex - 3
        graph[3].add(new Edge(3, 4, 4));

        // vertex - 4
        graph[4].add(new Edge(4, 1, -1));
        
    }

    public static void bellmanFordAlgorithm(ArrayList<Edge>[]graph, int src)
    {
        int dist[] = new int [graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE; // Assign the infinit value
            }
        }

        int V = graph.length;
        // algo

        for(int i=0;i<V-1;i++)
        {
            // edge - O[E]
            for(int j=0;j<graph.length;j++)
            {
                for(int k=0;k<graph[j].size();k++)
                {
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v])
                    {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // print
        System.out.println("Shortest Path: ");
        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        bellmanFordAlgorithm(graph, src);
    }
}
