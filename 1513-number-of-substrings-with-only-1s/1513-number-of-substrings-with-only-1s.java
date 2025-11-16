class Solution {
    public int numSub(String s) {
        int ans=0;
        double mod=Math.pow(10,9)+7;
        for(int i=0;i<s.length();i++){
            int j=i;
            long count=0;
            while(j<s.length() && s.charAt(j)=='1'){
                j++;
                count++;
            }
            i=j;
            count=(count*(count+1))/2;
            ans+=(count%mod);
        }
        return ans;
    }
}