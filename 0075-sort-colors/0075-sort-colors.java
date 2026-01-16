class Solution {
    public void sortColors(int[] nums) {
        int zeroes=0,ones=0,twos=0,idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            else if(nums[i]==1) ones++;
            else twos++;
        }
        while(zeroes-->0){
            nums[idx++]=0;
        }
        while(ones-->0){
            nums[idx++]=1;
        }
        while(twos-->0){
            nums[idx++]=2;
        }
    }
}