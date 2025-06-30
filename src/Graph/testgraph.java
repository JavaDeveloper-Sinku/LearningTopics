package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Arraylist
public class testgraph {
    public static void main(String[] args) {

        int numNodes = 4;
        ArrayList<ArrayList<Integer >> graph = new ArrayList<>();

        //sab nodes ka List bana lo
        for (int i=0 ; i< numNodes; i++){
            graph.add(new ArrayList<>());

        }
        // Edges add karo
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(2);
        graph.get(2).add(3);

        //print graph
        for (int i= 0 ;i< graph.size();i++){
            System.out.println("Node" + i + " --> "+ graph.get(i));
        }


        //Call BFS from node
        bfs(graph,4,0);

    }
    //BFS Algorithm in graph
    public static void bfs(ArrayList<ArrayList<Integer>> graph , int nodes, int start){

        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        System.out.println("BFS Traversal : ");

        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            for ( int neighbor : graph.get(current)){
                if (!visited[neighbor]){
                    visited[neighbor]  = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
