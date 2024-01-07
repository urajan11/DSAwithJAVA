import java.util.*;
public class HasPathProb 
{

    static class Edge
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
    }

    public static void createBSF(ArrayList<Edge>[]graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }

        // 0 --- vertex
        graph[0].add(new Edge(0, 1, 1));

        // 1 --- vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 --- vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 ---- Vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));

        // 4 --- Vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 6, 1));

        // 5 ---- vertex

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //  6---- Vertex

        graph[5].add(new Edge(6, 4, 1));
        graph[5].add(new Edge(6, 5, 1));

    }

    public static boolean hasPath(ArrayList<Edge>[]graph, int src, int dest, boolean visited[])
    {
        if(src == dest)
        {
            return true;
        }

        visited[src] = true;
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e  = graph[src].get(i);
            // e.dest = neighbour
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited))
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String []arg)
    {
        /*         (1)
         *    0--------1
         *            / \
         *        (1)/   \ (1)
         *          /     \    
         *         2------ 3
         *         |   (1)
         *      (1)|
         *         |
         *         4
         */

         int v = 6; // Vertex

        ArrayList<Edge>[] graph = new ArrayList[v];
        createBSF(graph);

        System.out.println(hasPath(graph, 0, 6, new boolean[v]));
        // true
        // src = 0; dest =8;
        // false
        
    }   
}
