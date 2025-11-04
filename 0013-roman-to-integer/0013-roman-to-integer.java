class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("I",1);map.put("V",5);map.put("X",10);map.put("L",50);map.put("C",100);
        map.put("D",500);map.put("M",1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int curr=map.get(String.valueOf(s.charAt(i)));
            int next=0;
            if(i!=s.length()-1) {
                next=map.get(String.valueOf(s.charAt(i+1)));
            }
            if(next!=0 && curr<next){
                ans+=(next-curr);
                i++;
            }else{
                ans+=curr;
            }
        }
        return ans;
    }
}