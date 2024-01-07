import java.util.*;
public class CheapestFlight 
{
    static class Edge{
        int src, dest,wt;
        public Edge(int s, int d, int wt)
        {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(int flight[][], ArrayList<Edge>[]graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++)
        {
            int src = flight[i][0];  // source
            int dest = flight[i][1]; // Destination
            int wt = flight[i][2]; // Weight for flight

            Edge e = new Edge(src, dest, wt); // new edge
            graph[src].add(e);
        }
    }

    static class Info
    {
        int v, cost, stops ;
        public Info(int v, int c,int s)
        {
            this.v = v ;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int cheapestFlightWithK(int n, int flight[][], int src, int dest, int k)
    {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);

        int dist[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;  // assign infnity
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0,0));

        while(!q.isEmpty())
        {
            Info curr = q.remove(); // take out current node

            if(curr.stops > k)
            {
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++) // loop for neighor
            {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
// rexasation
                // if(dist[u] !=Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <= k)
                // {
                //     dist[v] = dist[u] + wt;
                //     q.add(new Info(v, dist[v], curr.stops+1));
                // }

                if(curr.cost + wt < dist[v] && curr.stops <= k)
                {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        // dist[dest]
        if(dist[dest] == Integer.MAX_VALUE)
        {
            return -1;
        }
        else{
            return dist[dest];
        }
    }

    

    public static void main(String[] args)
    {
        int n=4;
        int flight[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0 , dst = 3, k = 1;

        ArrayList<Edge>[]graph = new ArrayList[n];
        createGraph(flight, graph);
        System.out.println(cheapestFlightWithK(n, flight, src, dst, k));
    }
}
