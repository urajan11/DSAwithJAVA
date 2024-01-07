import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    static class Edge {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int source) {
        int numVertices = graph.length;
        int[] dist = new int[numVertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        pq.offer(new Edge(source, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int vertex = current.dest;

            if (current.weight > dist[vertex]) {
                continue;
            }

            for (Edge neighbor : graph[vertex]) {
                int newWeight = dist[vertex] + neighbor.weight;

                if (newWeight < dist[neighbor.dest]) {
                    dist[neighbor.dest] = newWeight;
                    pq.offer(new Edge(neighbor.dest, newWeight));
                }
            }
        }

        // Print the shortest distances from the source vertex
        System.out.println("Shortest distances from vertex " + source + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int numVertices = 6;
        ArrayList<Edge>[] graph = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(2, 4));
        graph[1].add(new Edge(2, 1));
        graph[1].add(new Edge(3, 7));
        graph[2].add(new Edge(4, 3));
        graph[3].add(new Edge(5, 1));
        graph[4].add(new Edge(3, 2));
        graph[4].add(new Edge(5, 5));

        int sourceVertex = 0;
        dijkstra(graph, sourceVertex);
    }
}
