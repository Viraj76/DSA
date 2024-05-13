package Dp;

public class FibonacciWithOptimized {
    public static void main(String[] args) {

        int a = 6;

        int prev  = 1;
        int prevToPrev = 0;
        int ans = 0;

        for(int i=2; i<=a; i++){
            ans = prev + prevToPrev;
            prevToPrev = prev;
            prev = ans;

        }
        System.out.println(ans);
    }
}
