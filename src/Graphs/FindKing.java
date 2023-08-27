package Graphs;

import java.util.*;


public class FindKing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of tournaments
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int edg = (n * (n - 1)) / 2;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edg; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--;
            y--;
            adj.get(x).add(y);
        }

        for (int i = 0; i < n; i++) {
            int[] vis = new int[n];
            vis[i] = 1;
            for (int it : adj.get(i)) {
                vis[it] = 1;
                for (int it1 : adj.get(it)) {
                    vis[it1] = 1;
                }
            }
            boolean flg = false;
            for (int j = 0; j < n; j++) {
                if (vis[j] == 0) {
                    flg = true;
                    break;
                }
            }
            if (!flg) {
                ans.add(i + 1);
            }
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
