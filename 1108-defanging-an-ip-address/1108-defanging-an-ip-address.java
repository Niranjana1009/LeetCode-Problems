class Solution {
    public String defangIPaddr(String address) {
        int N=address.length();
        String ans="";
        for(int i=0;i<N;i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                ans+="[.]";
            }else{
                ans+=ch;
            }
        }
        return ans;
    }
}