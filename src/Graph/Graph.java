package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//There is using HashMap for graph
//String values
//less slow in Arraylist graph
public class Graph {

    Map<String, List<String>> graph = new HashMap<>();

    //Node add karne ki method

    public void addnode(String node){
        graph.putIfAbsent(node, new ArrayList<>());
    }

    //Do node ke beech connection add karna ka method
    public void addedge(String node1,String node2){
        graph.get(node1).add(node2);

        //Undirected graph ke liye
        graph.get(node2).add(node1);
    }
    //Graph print karne ka method
    public void printGraph(){
        for (String node : graph.keySet()){
            System.out.println(node + "-->"+ graph.get(node));
        }
    }

    public static void main(String[] args) {
        Graph g= new Graph();

        //add karna hai node/vertices
        g.addnode("A");
        g.addnode("B");
        g.addnode("C");
        g.addnode("D");

        //Connections create karne edge's
        g.addedge("A","B");
        g.addedge("B","C");
        g.addedge("A","D");


        //printing the graph
        g.printGraph();


    }
}
