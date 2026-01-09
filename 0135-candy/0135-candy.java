class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++) dp[i]=1;
        int sum=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            if(i!=0 && ratings[i]>ratings[i-1]){
                dp[i]=dp[i-1]+1;
            }
            else if(i!=n-1 && ratings[i]>ratings[i+1]){
                dp[i]=dp[i+1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(dp[i]<=dp[i+1]) dp[i]=1+dp[i+1];
            }
        }
        for(int i :dp) {
            System.out.print(i+" ");
            sum+=i;
        }
        return sum;
    }
}