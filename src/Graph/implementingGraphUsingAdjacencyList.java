package Graph;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class implementingGraphUsingAdjacencyList {

    private LinkedList[] adjacency;

    public implementingGraphUsingAdjacencyList(int v){
        adjacency = new LinkedList[v];
        for(int i=0; i<v; i++){
            adjacency[i]=new LinkedList<Integer>();
        }
    }

    public void insertEdge(int s, int d){
        adjacency[s].add(d);
        adjacency[d].add(s);
        System.out.print(adjacency[s]);
        System.out.print(adjacency[d]);
        System.out.println();
    }

    public void BFS(int source) {
        boolean[] visitedNodes = new boolean[adjacency.length];
        int[] parentNode = new int[adjacency.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visitedNodes[source] = true;
        parentNode[source] = -1;
        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p+" ");
            for (int n : (Iterable<Integer>) adjacency[p]) {
                if (!visitedNodes[n]) {
                    visitedNodes[n] = true;
                    q.add(n);
                    parentNode[n]=p;
                }
            }
        }
    }

    public void DFS(int source) {
        boolean[] visitedNodes = new boolean[adjacency.length];
        int[] parentNode = new int[adjacency.length];
        Stack<Integer> q = new Stack<>();
        q.add(source);
        visitedNodes[source] = true;
        parentNode[source] = -1;
        while (!q.isEmpty()) {
            int p = q.pop();
            System.out.print(p+" ");
            for (int n : (Iterable<Integer>) adjacency[p]) {
                if (!visitedNodes[n]) {
                    visitedNodes[n] = true;
                    q.add(n);
                    parentNode[n]=p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Vertices  --> ");
        int v=sc.nextInt();
        System.out.print("Enter number of Edges  --> ");
        int e=sc.nextInt();
        implementingGraphUsingAdjacencyList graph=new implementingGraphUsingAdjacencyList(v);

        System.out.println("Insert edges");
        for(int i=0; i<e; i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            graph.insertEdge(s,d);
        }

        System.out.println("Enter source for traversal");
        int source=sc.nextInt();
        graph.BFS(source);
        System.out.println();
        graph.DFS(source);

    }
}
