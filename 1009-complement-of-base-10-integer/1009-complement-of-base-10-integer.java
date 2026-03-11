class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String bin="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') bin+='1';
            else bin+='0';
        }
        return Integer.parseInt(bin,2);
    }
}