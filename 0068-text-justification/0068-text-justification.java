public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int nums = 0;

        for (String word : words) {
            if (word.length() + curr.size() + nums > maxWidth) {
                for (int i = 0; i < maxWidth - nums; i++) {
                    curr.set(i % (curr.size() - 1 > 0 ? curr.size() - 1 : 1), curr.get(i % (curr.size() - 1 > 0 ? curr.size() - 1 : 1)) + " ");
                }
                StringBuilder sb = new StringBuilder();
                for (String s : curr) sb.append(s);
                ans.add(sb.toString());
                curr.clear();
                nums = 0;
            }
            curr.add(word);
            nums += word.length();
        }

        StringBuilder lastLine = new StringBuilder();
        for (int i = 0; i < curr.size(); i++) {
            lastLine.append(curr.get(i));
            if (i != curr.size() - 1) lastLine.append(" ");
        }
        while (lastLine.length() < maxWidth) lastLine.append(" ");
        ans.add(lastLine.toString());

        return ans;
    }
}