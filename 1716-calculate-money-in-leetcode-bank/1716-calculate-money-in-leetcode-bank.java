class Solution {
    public int totalMoney(int n) {
        int[] arr=new int[]{7,1,2,3,4,5,6};
        int ans=0;
        for(int i=1;i<=n;i++) {
            ans+= arr[i%7];
            arr[i%7]++;
        }
        return ans;
    }
}