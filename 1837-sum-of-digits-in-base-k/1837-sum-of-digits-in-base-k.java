class Solution {
    private static int Base(int n,int k){
        int ans=0;
        while(n>0){
            ans+=(n%k);
            n/=k;
        }
        return ans;
    }
    public int sumBase(int n, int k) {
        return Base(n,k);
    }
}