package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedWeightedGraph {
    public Map<Integer, List<Edge>> adjList = new HashMap<>();

    static class Edge{
        int dest;
        int weight;


        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        public String toString(){
            return "(" + dest + ", weight: "+ weight + ")";
        }
    }
    public void addEdge(int src, int dest, int weight){
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(new Edge(dest,weight));
    }
    public void printGraph(){
        for (int node : adjList.keySet()){
            System.out.print(node + " -> "+ adjList.get(node));
            System.out.println();
        }
    }

    public static void main(String[] args) {
       DirectedWeightedGraph graph = new DirectedWeightedGraph();
       graph.addEdge(1,2,4);
       graph.addEdge(1,3,2);
       graph.addEdge(2,4,7);
       graph.addEdge(3,4,1);

       graph.printGraph();

    }
}
