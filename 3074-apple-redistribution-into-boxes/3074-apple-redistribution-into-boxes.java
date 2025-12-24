class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apples=0,boxes=0,n=capacity.length;
        for(int app:apple) apples+=app;
        Arrays.sort(capacity);
        for(int i=n-1;i>=0;i--){
            if(apples<=0) break;
            boxes++;
            apples-=capacity[i];
        }
        return boxes;
    }
}