class Solution {
    public boolean isMatch(String s, String p) {
        int M = s.length(), N = p.length();
        boolean[][] dp = new boolean[M + 1][N + 1];
        dp[0][0] = true;
        for (int j = 2; j <=N; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                char pch=p.charAt(j-1),sch=s.charAt(i-1);
                if (pch == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (sch == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (sch == pch || pch == '.');
                }
            }
        }
        return dp[M][N];
    }
}