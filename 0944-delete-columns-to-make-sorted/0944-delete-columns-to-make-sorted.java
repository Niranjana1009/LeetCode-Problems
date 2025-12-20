class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int col=0;col<strs[0].length();col++){
            boolean flag=false;
            char ch=strs[0].charAt(col);
            for(int row=1;row<strs.length;row++){
                if(strs[row].charAt(col)<ch) {
                    flag=true;
                    break;
                }
                ch=strs[row].charAt(col);
            }
            if(flag) ans++;
        }
        return ans;
    }
}