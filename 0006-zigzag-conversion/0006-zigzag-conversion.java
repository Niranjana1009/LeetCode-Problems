class Solution {
    public String convert(String s, int R) {
        if (R==1) return s;
        int n=s.length(),cycle=2*R-2,C=n;
        char[][] dp = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                dp[i][j] = ' ';
            }
        }
        int idx=0, col=0;
        while (idx <n) {
            for (int row = 0; row < R && idx < n; row++) {
                dp[row][col] = s.charAt(idx++);
            }
            for (int row = R - 2; row > 0 && idx < n; row--) {
                col++;
                dp[row][col] = s.charAt(idx++);
            }
            col++;
        }
        String ans="";
        for (int row = 0; row < R; row++) {
            for (int j = 0; j < C; j++) {
                if (dp[row][j] != ' ') {
                    ans+=dp[row][j];
                }
            }
        }
        return ans;
    }
}
