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
        if(head == null || head.next == null) return false;
        List<ListNode> list = new ArrayList<>();
        while(head != null && !list.contains(head)){
            list.add(head);
            head = head.next;
            if(head.next == null) return false;
        }
        return true;
    }
}