import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra_Algo {

    static class Edge {

        int weight;
        int source;
        int destination;

        public Edge(int weight, int source, int destination) {

            this.destination = destination;
            this.weight = weight;
            this.source = source;

        }

    }

    public static void main(String[] args) {

        ArrayList<Edge>[] Graph = new ArrayList[6];

        CreateGraph(Graph);

        dijkstras(Graph, 0, 6);


    }

    public static class Pair implements Comparable<Pair> {

        int node;
        int distance;

        public Pair(int node, int distance) {
            this.distance = distance;
            this.node = node;
        }

        @Override
        public int compareTo(Pair o) {

            return this.distance - o.distance;

        }
    }


    private static void dijkstras(ArrayList<Edge>[] graph, int source, int vertices) {

        PriorityQueue<Pair> queue = new PriorityQueue<>();

        int distance[] = new int[vertices];

        for (int i = 0; i < distance.length; i++) {
            if (i != source) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        boolean visited[] = new boolean[vertices];

        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {
            // shortest
            Pair Curr = queue.remove();

            if (!visited[Curr.node]) {
                visited[Curr.node] = true;

                for (int i = 0; i < graph[Curr.node].size(); i++) {

                    Edge e = graph[Curr.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if (distance[u] + e.weight < distance[v]) {

                        distance[v] = distance[u] + e.weight;

                    }


                }


            }


        }

        for (int i = 0; i < distance.length; i++) {
            System.out.println(distance[i]);
        }

    }

    private static void CreateGraph(@org.jetbrains.annotations.NotNull ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(2, 0, 1));
        graph[0].add(new Edge(4, 0, 2));
        graph[1].add(new Edge(7, 1, 3));
        graph[1].add(new Edge(1, 0, 1));
        graph[2].add(new Edge(3, 2, 4));
        graph[3].add(new Edge(1, 3, 5));
        graph[4].add(new Edge(2, 4, 3));
        graph[4].add(new Edge(5, 4, 5));
    }
}
