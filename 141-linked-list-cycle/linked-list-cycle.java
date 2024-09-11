/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(slow == null){
            return false;
        }
        while(slow.next != null){
            if(fast.next != null){
                if(fast.next.next != null){
                    fast = fast.next.next;
                }
            }   
            if(fast.next == slow){
                return true;
            }
            slow = slow.next;
        }
        return false;
    }
}