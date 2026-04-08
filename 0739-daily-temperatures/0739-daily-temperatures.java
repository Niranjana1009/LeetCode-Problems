class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<int[]> stack=new Stack<>();
        int N=nums.length-1;
        int[] res=new int[N+1];
        while(N>=0){
            while(!stack.isEmpty() && stack.peek()[0]<=nums[N]){
                stack.pop();
            }
            res[N]=(stack.isEmpty()?0:stack.peek()[1]-N);
            stack.push(new int[]{nums[N],N});
            System.out.println(stack.peek()[0]+" "+stack.peek()[1]);
            N--;
        }
        return res;
    }
}