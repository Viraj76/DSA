import java.util.Arrays;

public class ClusterDivision {
    public static int[] findMinMaxClusterCost(int[] sectorCost, int clusterCount) {
        int n = sectorCost.length;
        // Edge case: if there's only one cluster, the cost is simply sectorCost[0] + sectorCost[n - 1]
        if (clusterCount == 1) {
            int totalCost = sectorCost[0] + sectorCost[n - 1];
            return new int[]{totalCost, totalCost};
        }

        // Calculate minimum cost
        int minCost = calculateMinCost(sectorCost, clusterCount);

        // Calculate maximum cost
        int maxCost = calculateMaxCost(sectorCost, clusterCount);

        return new int[]{minCost, maxCost};
    }

    private static int calculateMinCost(int[] sectorCost, int clusterCount) {
        int n = sectorCost.length;
        // We need to find the minimum possible sum by forming clusters such that
        // we minimize the cost of individual clusters.
        // This can be done by putting the minimum cost sectors separately and the rest together.

        // The smallest (clusterCount - 1) sectors will be their own clusters.
        // The remaining sectors will form one cluster.

        int minCost = 0;

        for (int i = 0; i < clusterCount - 1; i++) {
            minCost += 2 * sectorCost[i];
        }

        // Add the cost of the last cluster
        minCost += sectorCost[clusterCount - 1] + sectorCost[n - 1];

        return minCost;
    }

    private static int calculateMaxCost(int[] sectorCost, int clusterCount) {
        int n = sectorCost.length;
        // To maximize the cost, we can form clusters such that we maximize the sum of
        // the two elements for each cluster.
        // This can be done by putting the largest sectors separately and the rest together.

        // The largest (clusterCount - 1) sectors will be their own clusters.
        // The remaining sectors will form one cluster.

        int maxCost = 0;

        for (int i = 0; i < clusterCount - 1; i++) {
            maxCost += 2 * sectorCost[n - 1 - i];
        }

        // Add the cost of the last cluster
        maxCost += sectorCost[0] + sectorCost[n - clusterCount];

        return maxCost;
    }

    public static void main(String[] args) {
        int[] sectorCost = {1, 2, 3, 2, 5};
        int clusterCount = 3;
        int[] result = findMinMaxClusterCost(sectorCost, clusterCount);
        System.out.println("Minimum cost: " + result[0]);
        System.out.println("Maximum cost: " + result[1]);
    }
}
