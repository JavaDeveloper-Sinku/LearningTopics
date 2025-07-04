package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedUnweightedGraph {
    public static Map<Integer, List<Integer>> adjList = new HashMap<>();


    public void addEdge(int src , int dest){
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(dest);

    }

    public static void printGraph(){
        for (int node : adjList.keySet()){
            System.out.print(node + " -> " + adjList.get(node));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedUnweightedGraph graph = new DirectedUnweightedGraph();
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        
        graph.printGraph();
    }
}
