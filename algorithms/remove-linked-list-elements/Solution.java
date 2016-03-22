// Source: https://leetcode.com/problems/remove-linked-list-elements/

/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode last = null;
        ListNode current = head;
        
        while (current != null) {
            if (current.val == val) {
                if (last == null)
                    head = current.next;
                else
                    last.next = current.next;
            } else {
                last = current;
            }
            
            current = current.next;
        }
        
        return head;
    }
}
