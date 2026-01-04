class Solution {
        public int largestRectangleArea(int[] heights) {
        int N=heights.length,max=0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<=N;i++){
            int h=0;
            if(i!=N) h=heights[i];
            if (stack.isEmpty() || h>=heights[stack.peek()]) {
                stack.push(i);
            } else {
                int temp=stack.pop(),area=0;
                if(stack.isEmpty()) area=i;
                else area=i-stack.peek()-1;
                max=Math.max(max, heights[temp]*area);
                i--;
            }
        }
        return max;
    }
}