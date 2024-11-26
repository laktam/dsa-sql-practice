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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode l1 = head;
        ListNode l2 = head;

        ListNode p1 = head;
        ListNode p2 = head;

        while(p2 != null){
            if(p2.next != null){
                if(p2.next.next == null) break;
                p1 = p1.next;
                p2 = p2.next.next;
            }else break;
        }
        System.out.println(p1.val);
        p1 = p1.next;
        l2 = p1;

        // reverse second part
        ListNode prev = null;
        while(p1 != null){
            ListNode next = p1.next;
            p1.next = prev;
            prev = p1;
            p1 = next;
        }

        while(prev != null){
            if(l1.val != prev.val) return false;
            prev = prev.next;
            l1 = l1.next;
        }
        return true;
    }
}