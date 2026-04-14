class Solution {

    public long minimumTotalDistance(List<Integer> robots, int[][] factories) {

        Collections.sort(robots);
        Arrays.sort(factories, Comparator.comparingInt(a -> a[0]));
        List<Integer> pos = new ArrayList<>();
        for (int[] factory : factories) {
            for (int i = 0; i < factory[1]; i++) {
                pos.add(factory[0]);
            }
        }
        int count = robots.size(), fc = pos.size();
        long[] next = new long[fc + 1];
        long[] curr = new long[fc + 1];
        curr[fc] = (long) 1e12;
        for (int i = count - 1; i >= 0; i--) {
            for (int j = fc - 1; j >= 0; j--) {
                long assign =
                    Math.abs((long) robots.get(i) - pos.get(j)) +
                    next[j + 1];
                long skip = curr[j + 1];
                curr[j] = Math.min(assign, skip);
            }
            System.arraycopy(curr, 0, next, 0, fc + 1);
        }
        return curr[0];
    }
}