package Dp;

/*
Tc = N
SC = N (due to dp array)
 */
public class FibonacciWithTabulation {

    public static void main(String[] args) {
        int a = 5;
        int n = findFibo(a);
        System.out.println(n);
    }

    private static int findFibo(int n) {
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
        /*
        num = fibo(n-1) + fibo(n-2)
         */
    }
}
