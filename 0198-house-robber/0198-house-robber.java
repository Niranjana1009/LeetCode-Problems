class Solution {
    public int rob(int[] nums) {
        int N=nums.length;
        if(N==1) return nums[0];
        int[] dp=new int[N];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for(int i=2;i<N;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[N-1];
    }
}