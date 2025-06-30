package Graph;

import java.util.ArrayList;
import java.util.List;

public class weightedGraph {
    int v;
    List<List<Pair>> adjList;

    static class Pair{
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public weightedGraph(int v) {
        this.v = v;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < v; i++){
            adjList.add(new ArrayList<>());

        }
    }
    public void addEdge(int src, int dest, int weight){
        adjList.get(src).add(new Pair(dest, weight));
        adjList.get(dest).add(new Pair(src,weight));
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print("Node " + i + " connects to: ");
            for (Pair p : adjList.get(i)) {
                System.out.print("(" + p.node + ", weight=" + p.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        weightedGraph g = new weightedGraph(3);
        g.addEdge(0,1,5);
        g.addEdge(0, 2, 3);
        g.addEdge(1, 2, 2);

        g.printGraph();

    }
}
