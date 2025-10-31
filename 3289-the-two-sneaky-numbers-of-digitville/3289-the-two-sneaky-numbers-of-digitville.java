class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[]{-1,-1};
        Arrays.sort(nums);
        int idx=0;
        for(int i=0;i<nums.length-1;i++){
            if(idx==2) break;
            if(nums[i]==nums[i+1]) ans[idx++]=nums[i];
        }
        return ans;
    }
}