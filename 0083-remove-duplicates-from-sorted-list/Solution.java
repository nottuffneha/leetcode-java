// 83. Remove Duplicates from Sorted List (Easy)
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Idea: If the next node has the same value, skip it; otherwise move forward.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }
}
