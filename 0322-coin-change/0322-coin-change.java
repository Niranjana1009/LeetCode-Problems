class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int c:coins){
            for(int i=c;i<=amount;i++){
                if(dp[i-c]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i-c]+1,dp[i]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}