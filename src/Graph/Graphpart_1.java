package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graphpart_1 {
    private int v;
    private List<List<Integer>> adjList;

    public Graphpart_1(int v) {
        this.v = v;
        this.adjList = new ArrayList<>();

        for (int i =0 ; i < v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    //Adding edge for undirected and unweight graph
    public void addEdge(int src , int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    //Print graph
    public void printgraph(){
        for (int i = 0; i<v; i++){
            System.out.println("Node "+ i + " connects to: ");
            for (Integer neighbor : adjList.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    //Breadth-First Search
    public void bfs(int start){
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList.get(node)){
                if (!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    //Depth-First Search
    public void dfs(int start){
        boolean[] visited = new boolean[v];
        dfsUtil(start,visited);
    }
    private void dfsUtil(int node, boolean[] visited){
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList.get(node)){
            if (!visited[neighbor]){
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        Graphpart_1 g= new Graphpart_1(5);
        g.addEdge(0,1);
        g.addEdge(0,4);

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);


        System.out.println("BFS");
        g.bfs(0);
        System.out.println();
        System.out.println("DFS");
        g.dfs(0);
    }
}
