class Solution {
    public int[] runningSum(int[] nums) {
        int N=nums.length;
        int[] ans=new int[N];
        ans[0]=nums[0];
        for(int i=1;i<N;i++){
            ans[i]=nums[i]+ans[i-1];
        }
        return ans;
    }
}