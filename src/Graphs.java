import java.util.*;

class Graphs {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    List<Integer> getNeighbors(int node) {
        return adjacencyList.getOrDefault(node, new ArrayList<>());
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int m = scanner.nextInt();

        Graphs graph = new Graphs();

        System.out.println("Enter the edges (u v): ");
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        // Example: Get neighbors of node 2
        List<Integer> neighborsOfNode2 = graph.getNeighbors(1);
        System.out.println("Neighbors of node 1: " + neighborsOfNode2);
    }
}
