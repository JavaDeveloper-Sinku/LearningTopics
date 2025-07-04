package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedWeightedGraph {
    public Map<Integer, List<Edge>> adjList = new HashMap<>();

   static class Edge{
        int dest;
        int weight;

       public Edge(int dest, int weight) {
           this.dest = dest;
           this.weight = weight;
       }
       public String toString(){
           return "(" + dest + ", weight: " + weight + ")";
       }
   }
   public void addEdge(int src, int dest, int weight){
       adjList.putIfAbsent(src, new ArrayList<>());
       adjList.putIfAbsent(dest,new ArrayList<>());

       adjList.get(src).add(new Edge(dest, weight));
       adjList.get(dest).add(new Edge(src,weight));
   }
   public void printGraph(){
       for (int node : adjList.keySet()){
           System.out.print(node + " -> " + adjList.get(node));
           System.out.println();
       }
   }

    public static void main(String[] args) {
        UndirectedWeightedGraph graph= new UndirectedWeightedGraph();
        graph.addEdge(1,2,4);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 1);

        graph.printGraph();
    }
}
