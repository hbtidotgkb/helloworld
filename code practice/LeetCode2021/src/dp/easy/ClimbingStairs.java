package dp.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.print(new ClimbingStairs().climbStairsDP(1));
    }
    public int climbStairs(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairsDP(int n) {
        int[] dp = new int[n+1];
        if(n <=1) return 1;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
