class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int count=0,total=0,sum=0;
        for(int val:nums) total+=val;
        for(int i=0;i<nums.size()-1;i++){
            sum+=nums[i];
            total-=nums[i];
            if((sum-total)%2==0){
                count++;
            }
        }
        return count;
    }
};