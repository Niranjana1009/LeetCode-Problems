class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        int idx=0,n=pattern.length();
        HashMap<String,Character> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                char val=map.get(arr[i]);
                if(idx<n && val!=pattern.charAt(idx)) return false;
            }else{
                if(idx<n) map.put(arr[i],pattern.charAt(idx));
            }
            idx++;
        }
        HashMap<Character,String> Map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(Map.containsKey(pattern.charAt(i))){
                String val=Map.get(pattern.charAt(i));
                if(!val.equals(arr[i])) return false;
            }else{
                Map.put(pattern.charAt(i),arr[i]);
            }
        }
        System.out.println(Map);
        return idx==n? true:false;
    }
}