class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n>1){
            int teamMatches,wins;
            if(n%2==0) {
                teamMatches= n/2;
                wins= n/2;
            }
            else{
                teamMatches= (n-1)/2;
                wins= (n-1)/2 +1;
            }
            matches+=teamMatches;
            n=wins;
        }
        return matches;
    }
}