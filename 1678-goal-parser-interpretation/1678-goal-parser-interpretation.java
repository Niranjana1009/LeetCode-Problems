class Solution {
    public String interpret(String command) {
        int N=command.length();
        String ans="";
        for(int i=0;i<N;i++){
            if(command.charAt(i)=='G') ans+="G";
            else if(i+1<N && command.substring(i,i+2).equals("()")) ans+="o";
            else if(i+3<N && command.substring(i,i+4).equals("(al)")) ans+="al"; 
        }
        return ans;
    }
}