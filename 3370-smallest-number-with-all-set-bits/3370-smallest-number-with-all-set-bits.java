class Solution {
    public int smallestNumber(int n) {
        int log=0;
        while((1<<log)<=n) log++;
        return (1<<log)-1;
    }
}