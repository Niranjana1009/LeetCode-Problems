class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int R=text1.length(),C=text2.length(),max=0;
        int[][] dp=new int[R+1][C+1];
        for(int row=1;row<=R;row++){
            for(int col=1;col<=C;col++){
                if(text1.charAt(row-1)==text2.charAt(col-1)){
                    dp[row][col]=1+dp[row-1][col-1];
                }else{
                    dp[row][col]=Math.max(dp[row-1][col],dp[row][col-1]);
                }
                max=Math.max(dp[row][col],max);
            }
        }
        return max;
    }
}