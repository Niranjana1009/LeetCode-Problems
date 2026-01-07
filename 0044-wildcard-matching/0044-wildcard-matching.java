class Solution {
    public boolean isMatch(String s, String p) {
        int sidx = 0, pidx = 0, ast= -1, match = 0;
        while (sidx < s.length()) {
            if (pidx < p.length() &&
                (p.charAt(pidx) == s.charAt(sidx) || p.charAt(pidx) == '?')) {
                sidx++;
                pidx++;
            }
            else if (pidx < p.length() && p.charAt(pidx) == '*') {
                ast= pidx;
                match = sidx;
                pidx++;
            }
            else if (ast!= -1) {
                pidx = ast+ 1;
                match++;
                sidx = match;
            }
            else {
                return false;
            }
        }
        while (pidx < p.length() && p.charAt(pidx) == '*') {
            pidx++;
        }
        return pidx == p.length();
    }
}
