class Solution {
    ArrayList<String> arr = new ArrayList<>();
    public String getPermutation(int n, int k) {
        String s = "";
        for (int i = 1; i <= n; i++) s += i;
        dfs(s, 0, new StringBuilder());
        Collections.sort(arr);
        return arr.get(k - 1);
    }

    private void dfs(String s, int mask, StringBuilder curr) {
        if (curr.length() == s.length()) {
            arr.add(curr.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((mask & (1 << i)) == 0) {
                curr.append(s.charAt(i));
                dfs(s, mask | (1 << i), curr);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
}
