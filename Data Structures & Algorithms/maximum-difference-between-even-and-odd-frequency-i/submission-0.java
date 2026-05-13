class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int odd = 0, even = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f == 0) continue;

            if (f % 2 == 0)
                even = Math.min(even, f);
            else
                odd = Math.max(odd, f);
        }

        return odd - even;
    }
}