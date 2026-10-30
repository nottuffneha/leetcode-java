// 14. Longest Common Prefix (Easy)
// https://leetcode.com/problems/longest-common-prefix/
// Idea: Start with the first word as the prefix and keep chopping its last char until every other word starts with it.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
