package src.assignments.linkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromicLinkedList {
    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (true) {
            if (fast == null) { //even
                break;
            }
            if (fast.next == null) { //odd
                slow = slow.next;
                break;
            }
            //continue to end
            fast = fast.next.next;

            //reversal
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        while (slow != null) {
            if (prev.val != slow.val) return false;
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}