/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }else if (head.next == null){
            return head;
        }
        ListNode node = head.next;
        ListNode oldHead = null;
        while(head != null){
            if(head.next != null){
                ListNode tmp = head.next;
                head.next = head.next.next;
                tmp.next = head;
                if(oldHead != null){
                    oldHead.next = tmp;
                }
            }
            oldHead = head;
            head = head.next;
        }
        return node;
    }
}