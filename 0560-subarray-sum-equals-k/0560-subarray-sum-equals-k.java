class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int N=nums.length;
        int prev=0,count=0;
        for(int i=0;i<N;i++){
            prev+=nums[i];
            int cmp= prev-k;
            if(map.containsKey(cmp)) count+=map.get(cmp);
            map.put(prev,map.getOrDefault(prev,0)+1);
        }
        return count;
    }
}