class Solution {
    public boolean canJump(int[] nums) {
        int N=nums.length;
        int maxReach=0,sum=0;
        for(int index=0;index<N-1;index++){
            if(index<=maxReach){
                sum=index+nums[index];
                if(sum>=maxReach){
                    maxReach=Math.max(maxReach,sum);
                }   
            }
        }if(maxReach>=N-1){
            return true;
        }
        return false;
    }
}