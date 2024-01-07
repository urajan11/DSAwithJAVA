import java.util.ArrayList;
import java.util.*;
public class CycleDetection_Directed 
{
    static class Edge
    {
        int src; 
        int dest;
        Edge(int s, int d)
        {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Cycle Graph

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

        //  Not Cycle graph
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(0, 1));

        // graph[2].add(new Edge(1, 3));

        // graph[3].add(new Edge(2, 3));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph)
    {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(isCycleUtil(graph,i,vis,stack))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[]graph,int curr, Boolean vis[], boolean stack[] )
    {
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(stack[e.dest])
            {
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
            {
                return true;
            }
        }
        stack[curr] = false;
        return  false;
    }

    public static void main(String[] args)
    {
        int v=5;
        ArrayList<Edge> []graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
