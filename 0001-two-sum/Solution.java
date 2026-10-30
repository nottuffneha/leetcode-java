// 1. Two Sum (Easy)
// https://leetcode.com/problems/two-sum/
// Idea: Store each number's index in a HashMap; for every number check if (target - number) was already seen. O(n).

class Solution {
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}
