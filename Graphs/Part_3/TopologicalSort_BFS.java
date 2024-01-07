import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort_BFS 
{

    static class Edge
    {
        int dest, src;
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

        // vertex - 0
        // vertex - 1
        // vertex - 2
        graph[2].add(new Edge(2, 3));

        // vertex 3
        graph[3].add(new Edge(3, 1));
        // vertex 4
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // vertex 5
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calIndegree(ArrayList<Edge>[]graph, int indeg[])
    {
        for(int i=0;i<graph.length;i++)
        {
            int v = i; // vertex = i
            for(int j=0;j<graph[v].size();j++)
            {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge>[]graph)
    {
        int indeg[] = new int[graph.length];
        calIndegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length;i++)
        {
            if(indeg[i] == 0) // if indegree = 0
            {
                q.add(i);  
            }
        }

        // BFS

        while(!q.isEmpty())
        {
            int curr = q.remove();
            System.out.print(curr+" ");  // topological sort print

            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0)
                {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        
        /*
         *            
         * Consider as a Directed graph
         *           5      4
         *           | \  / |
         *           |  0   |  
         *           |      |
         *           2      1
         *            \   /  
         *              3
         */  

        int v = 6;
        ArrayList<Edge>[]graph = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}
