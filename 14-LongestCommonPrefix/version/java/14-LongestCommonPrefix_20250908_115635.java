// Last updated: 9/8/2025, 11:56:35 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Loop through each word in strs
        for (int i = 1; i < strs.length; i++) {
            // Limit loop to the smaller of prefix length or current word length
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            // Cut the prefix to the matching length
            prefix = prefix.substring(0, j);

            // Early return if no common prefix
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}