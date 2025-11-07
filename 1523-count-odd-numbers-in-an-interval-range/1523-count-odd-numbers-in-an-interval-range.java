class Solution {
    public int countOdds(int low, int high) {
        int ans= (high-low)/2;
        return (low%2==1 || high%2==1)?ans+1:ans; 
    }
}