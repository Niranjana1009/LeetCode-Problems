class Solution {
    public int myAtoi(String s) {
        int idx=0,N=s.length(),sgn=1,min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        long num=0;
        while(idx< N && s.charAt(idx)==' ') idx++;
        if(idx<N && (s.charAt(idx)=='-' || s.charAt(idx)=='+')){
            if(s.charAt(idx)=='-') sgn=-1;
            idx++;
        }
        while(idx<N && s.charAt(idx)=='0') idx++;
        while(idx<N){
            char ch=s.charAt(idx);
            if(!Character.isDigit(ch)) break;
            num=(num*10)+(ch-'0');
            idx++;
            if(num*sgn>max) return max;
            if(num*sgn<min) return min;
        }
        num*=sgn;
        return (int)num;
    }
}