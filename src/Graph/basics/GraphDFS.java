package Graph.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize the graph
        graph.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        graph.add(new ArrayList<Integer>() {{ add(1); add(4); }});
        graph.add(new ArrayList<Integer>() {{ add(1); add(5); }});
        graph.add(new ArrayList<Integer>() {{ add(2); add(4); }});
        graph.add(new ArrayList<Integer>()); // Node 5, with no edges

//        System.out.println(graph.size());
        bfs(graph);
    }

    private static void bfs(ArrayList<ArrayList<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[graph.size() + 1];

        q.add(1);
        visited[1] = true;

        while (!q.isEmpty()){
            int node = q.poll();
            System.out.println(node);
            for(int i=0; i<graph.get(node - 1).size(); i++){
                int currentNode = graph.get(node-1).get(i);
                if(!visited[currentNode]){
                    q.add(currentNode);
                    visited[currentNode] = true;
                }
            }
        }


    }
}
