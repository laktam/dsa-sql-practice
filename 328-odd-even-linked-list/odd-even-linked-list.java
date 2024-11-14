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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode current = head.next.next;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode firstEven = even;
        int i = 0;
        while(current != null){
            if(i % 2 == 0){
                odd.next = current;
                odd = odd.next;
            }else {
                even.next = current;
                even = even.next;
            }
            current = current.next;
            i++;
        }
        even.next = null;
        odd.next = firstEven;
        return head;
        
    }
}