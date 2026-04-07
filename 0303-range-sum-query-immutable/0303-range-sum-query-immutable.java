class NumArray {
    static int[] arr;
    public NumArray(int[] nums) {
        int N=nums.length;
        arr=new int[N];
        arr[0]=nums[0];
        for(int i=1;i<N;i++){
            arr[i]+=arr[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ans=arr[right]-(left-1>=0 ? arr[left-1]:0);
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */