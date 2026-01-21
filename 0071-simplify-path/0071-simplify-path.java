class Solution {
    public String simplifyPath(String path) {
        String[] s=path.split("/");
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length;i++){
            if (s[i].equals("") || s[i].equals(".")) {
                continue;
            }
            if (s[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s[i]);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.insert(0, "/" + stack.pop());
        }
        return str.length() == 0 ? "/" : str.toString();
    }
}