class Solution {
    private static String sum(String n){
        int ans=0;
        for(int i=0;i<n.length();i++){
            ans+= n.charAt(i)-'0';
        }
        return Integer.toString(ans);
    }
    public int getLucky(String s, int k) {
        String num="";
        for(int i=0;i<s.length();i++){
            num+=(s.charAt(i)-96);
        }
        while(k-- >0){
            num=sum(num);
        }
        return Integer.parseInt(num);
    }
}