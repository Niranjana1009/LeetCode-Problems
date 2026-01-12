class Solution {
    public static void rec(int n,int oc,int cc,String s,List<String> ans){
        if(s.length()==(2*n)){
            ans.add(s);
            return;
        }
        if(oc<n){
            rec(n,oc+1,cc,s+"(",ans);
        }
        if(cc<oc){
            rec(n,oc,cc+1,s+")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String s="";
        rec(n,0,0,s,ans);
        return ans;
    }
}