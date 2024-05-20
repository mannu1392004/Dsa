import java.util.ArrayList;

public class graph {

    static class edge{
        int source;
        int destination;

        public edge(int i, int i1) {
            this.destination = i;
            this.source = i1;
        }


    }


    public static void CreateGraphs(ArrayList<edge>graph[] ) {

        for (int i = 0;i<graph.length;i++){

            graph[i] = new ArrayList<>();

        }

        graph[0].add(new edge(1,2));
        graph[1].add(new edge(3,5));


    }


    public static void main(String[] args){
int vertex = 4;
        ArrayList<edge> graph[] = new ArrayList[vertex];




    }

}
