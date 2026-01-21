class Solution {
    public int uniquePathsWithObstacles(int[][] matrix) {
        int R=matrix.length,C=matrix[0].length;
        int[][] dp=new int[R+1][C+1];
        if(matrix[0][0]==1) return 0;
        dp[1][1]=1;
        for(int row=1;row<=R;row++){
            for(int col=1;col<=C;col++){
                if(matrix[row-1][col-1]==1) dp[row][col]=0;
                else dp[row][col]+=dp[row-1][col]+dp[row][col-1];
            }
        }
        return dp[R][C];
    }
}