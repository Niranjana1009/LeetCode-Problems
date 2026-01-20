class Solution {
    private boolean isAllVowelPresent(int[] freq){
        return (freq['a'-'a']>0 && freq['e'-'a']>0 && freq['i'-'a']>0 && 
            freq['o'-'a']>0 && freq['u'-'a']>0);
    }
    private boolean isConsonant(char ch){
        return (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u');
    }
    private long atleast(int k, String word){
        int n=word.length(),cons=0,left=0;
        int[] freq=new int[26];
        long count=0;
        for(int right=0;right<n;right++)
        {
            char ch=word.charAt(right);
            if(isConsonant(ch)) cons++;
            freq[ch-'a']++;
            while(cons>=k && isAllVowelPresent(freq))
            {
                count+=(n-right);
                char c=word.charAt(left);
                if(isConsonant(c)) cons--;
                freq[c-'a']--;
                left++;
            }
        }
        return count;
    }
    public long countOfSubstrings(String word, int k) {
        return atleast(k, word)-atleast(k+1, word);
    }
}