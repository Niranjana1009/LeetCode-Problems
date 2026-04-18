class Solution {
    private static int rec(int[] dp,int n,int[] cost){
        if(n>=cost.length) return 0;
        if(dp[n]!=-1) return dp[n];

        dp[n]=cost[n]+Math.min(rec(dp,n+1,cost),rec(dp,n+2,cost));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(rec(dp,0,cost),rec(dp,1,cost));
    }
}