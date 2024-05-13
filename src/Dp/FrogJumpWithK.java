package Dp;
import java.util.Arrays;

public class FrogJumpWithK {

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] stones = {10, 30, 40, 50, 20};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = findCost(n, k, stones, n-1, dp);
        System.out.println(ans);
    }

    private static int findCost(int n, int k, int[] stones, int i, int[] dp) {
        if (i == 0) return 0;
        if (dp[i] != -1) {
            return dp[i];
        }
        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                min = Math.min(min, Math.abs(stones[i] - stones[i - j]) + findCost(n, k, stones, i - j, dp));
            }
        }
        dp[i] = min;
        return dp[i];
    }


}
