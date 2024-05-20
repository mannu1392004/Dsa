import java.util.ArrayList;

public class graph_With_Weight {

    static class Edge {
        int Source;
        int Destination;
        int Weight;

        public Edge(int source, int Destination, int Weight) {
            this.Source = source;
            this.Weight = Weight;
            this.Destination = Destination;
        }
    }

    public static void CreateGraphs(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[2].add(new Edge(2, 1, 10));
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));
        graph[3].add(new Edge(3, 2, -1));
        graph[3].add(new Edge(3, 1, 0));

    }


    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[4];

        CreateGraphs(graph);

        for (int i = 0; i < graph[1].size(); i++) {

            System.out.println(
                    graph[1].get(i).Source
            );

        }

    }


}
