// 20. Valid Parentheses (Easy)
// https://leetcode.com/problems/valid-parentheses/
// Idea: Use a stack: push the expected closing bracket for every opener, and each closer must match the top of the stack.

class Solution {
    public boolean isValid(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
