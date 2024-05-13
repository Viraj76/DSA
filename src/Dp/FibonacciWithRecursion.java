package Dp;

import java.util.Arrays;


/*
Tc = N
SC = N(due to recursion stack) + N (due to dp array)
 */
public class FibonacciWithRecursion {

    public static void main(String[] args) {
/*
0 1 1 2 3 5 8  13
 */
        int a = 7;
        int [] dp = new int[a+1];
        Arrays.fill(dp,-1);
        int n = printFiboTerm(a , dp);

        System.out.println(n);
    }

    private static int printFiboTerm(int i , int[] dp) {
        if(i <= 1) return i;

        if(dp[i]  != -1) return dp[i];

        int calc = printFiboTerm(i-1,dp) + printFiboTerm(i-2,dp);
        dp[i] = calc;
        return calc;
    }
}
