// 28. Find the Index of the First Occurrence in a String (Easy)
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Idea: Slide a window of needle's length over haystack and return the first spot where the substring matches.

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
