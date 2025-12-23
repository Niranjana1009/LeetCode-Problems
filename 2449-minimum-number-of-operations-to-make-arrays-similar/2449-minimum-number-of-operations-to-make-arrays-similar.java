class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int val:nums) {
            if(val%2==0) even.add(val);
            else odd.add(val);
        }

        ArrayList<Integer> todd=new ArrayList<>();
        ArrayList<Integer> teven=new ArrayList<>();
        for(int val:target){
            if(val%2==0) teven.add(val);
            else todd.add(val);
        }

        Collections.sort(odd);
        Collections.sort(todd);
        Collections.sort(even);
        Collections.sort(teven);

        long ans=0;
        for(int i=0;i<even.size();i++){
            if(even.get(i)>teven.get(i)){
                ans+= (even.get(i)-teven.get(i))/2;
            }
        }
        for(int i=0;i<odd.size();i++){
            if(odd.get(i)>todd.get(i)){
                ans+= (odd.get(i)-todd.get(i))/2;
            }
        }
        return ans;
    }
}