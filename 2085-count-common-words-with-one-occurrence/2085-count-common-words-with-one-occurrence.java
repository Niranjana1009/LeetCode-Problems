class Solution {
    public int countWords(String[] word1, String[] word2) {
        int count=0;
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        for(String word:word1) map1.put(word,map1.getOrDefault(word,0)+1);
        for(String word:word2) map2.put(word,map2.getOrDefault(word,0)+1);
        for(String word:word1){
            if(map2.containsKey(word)){
                if(map1.get(word)==1 && map2.get(word)==1) count++;
            }
        }
        return count;
    }
}