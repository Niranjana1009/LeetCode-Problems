class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0,N=candies.length;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<N;i++) max=Math.max(max,candies[i]);
        for(int i=0;i<N;i++){
            if(candies[i]+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}