class Solution {
    private int find(String s){
        for(char c: s.toCharArray())
            if(!(c >= '0' && c <= '9')) return -1;
        return s.length();
    }
    private int valid(String s){
        if(s.length() == 0) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+')
            return find(s.substring(1));
        return find(s);
    }
    private int helper(String s){
        if(s.length() == 0) return 0;
        String arr[] = s.split("\\.", -1);
        if(arr.length > 2 || arr.length == 0) return -1;
        if(arr.length == 2) {
            int len1 = valid(arr[0]);
            int len2 = find(arr[1]);
            if(len1 == -1 || len2 == -1) return -1;
            return len1 + len2;
        }
        return valid(arr[0]);
    }
    public boolean isNumber(String s) {
        s = s.toLowerCase();
        String arr[] = s.split("e", -1);
        if(arr.length > 2 || arr.length == 0) return false;
        if(arr.length == 2) 
            return (helper(arr[0]) >= 1) 
                && (valid(arr[1]) >= 1);
        return (helper(arr[0]) >= 1);
    }
}