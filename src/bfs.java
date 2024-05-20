import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    static class Edge {
        int Source;
        int Destination;

        public Edge(int source, int destination) {
            this.Destination = destination;
            this.Source = source;
        }

    }


    public static void CreateGraphs(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 3));
        graph[6].add(new Edge(6, 5));


    }

    public static void Bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[7];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.println(curr);
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).Destination);
                }
            }
        }


    }


    public static void Dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.println(curr);
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                Dfs(graph, e.Destination, vis);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[7];

        CreateGraphs(graph);

        boolean[] vis = new boolean[7];
        Dfs(graph, 0, vis);
    }
}
