class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                maxLength = Math.max(maxLength, end - start);
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            end++;
        }
        //if (start == 0) return s.length();
        return Math.max(maxLength, end - start);
    }
}