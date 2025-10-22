class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) dp[i][i]=1;
        int r=0,c=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i+1)==s.charAt(i)) {
                dp[i][i+1]=1;
                r=i;
                c=i+1;
            }
        }
        for(int len=3;len<=n;len++){
            for(int row=0;row<=n-len;row++){
                int col= len+row-1;
                if(s.charAt(row)==s.charAt(col)){
                    if(dp[row+1][col-1]==1){
                        dp[row][col]=1;
                        r=row-1;
                        c=col-1;
                    }
                }
            }
        }
        return s.substring(r,c+1);
    }
}