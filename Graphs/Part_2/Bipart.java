import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class Bipart 
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
    public static void createGraph(ArrayList<Edge> []graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }

        // vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        

        // vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // vertex 3
        graph[3].add(new Edge(3, 1));
         // graph[3].add(new Edge(3, 4));

        // vertex 4
        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

    }
    public static boolean isBipart(ArrayList<Edge>[]graph)
    {
        int col[] = new int[graph.length];
        for(int i=0;i<col.length;i++)
        {
            col[i] = -1;  // No Color
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++)
        {
            if(col[i] == -1)
            {
                q.add(i);
                col[i] = 0; // yellow
                while(!q.isEmpty())
                {
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j ++)
                    {
                        Edge e  = graph[curr].get(j); // e.dest
                        if(col[e.dest] == -1)
                        {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr])
                        {
                            return false; // not biparte
                        }
                    }

                }
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        // If graph does not have cycle  it is a bipart graph
        /*
         *    0 ---2
         *   /     /
         *  1     4 
         *   \   /
         *     3
         */

        int v = 5;
        ArrayList<Edge>[]graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipart(graph));
    }

}
