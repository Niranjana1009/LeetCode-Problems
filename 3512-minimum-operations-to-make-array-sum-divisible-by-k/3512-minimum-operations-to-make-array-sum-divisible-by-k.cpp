class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int sum=0;
        for(int val:nums) sum+=val;
        return sum%k;
    }
};