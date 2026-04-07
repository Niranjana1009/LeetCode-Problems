class Solution {
    private static int burst(int[] nums,Integer[][] dp,int left,int right){
        if(left>right) return 0;
        if(dp[left][right]!=null) return dp[left][right];

        int mxc=0;
        for(int i=left;i<=right;i++){
            int thislast=nums[i]*(left-1>=0?nums[left-1]:1)*(right+1>=nums.length?1:nums[right+1]);
            int curr= burst(nums,dp,left,i-1) + burst(nums,dp,i+1,right);
            curr+=thislast;
            mxc=Math.max(mxc,curr);
        }
        dp[left][right]=mxc;
        return mxc;
    }
    public int maxCoins(int[] nums) {
        int N=nums.length;
        Integer[][] dp=new Integer[N][N];
        return burst(nums,dp,0,N-1);
    }
}