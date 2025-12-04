class Solution {
    public int countCollisions(String directions) {
        Stack<Character> stack=new Stack<>();
        int collisions=0;
        stack.push(directions.charAt(0));
        for(int i=1;i<directions.length();i++){
            char ch=directions.charAt(i);
            int peeked=stack.peek();
            if(peeked=='R' && (ch=='L' || ch=='S')) {
                collisions+=(ch=='L')?2:1;
                stack.pop();
                while(!stack.isEmpty() && stack.peek()=='R'){
                    stack.pop();
                    collisions++;
                }
                stack.push('S');
            }
            else if(peeked=='S' && ch=='L') {
                collisions+=1;
            }
            else{
                stack.push(ch);
            }
        }
        return collisions;
    }
}