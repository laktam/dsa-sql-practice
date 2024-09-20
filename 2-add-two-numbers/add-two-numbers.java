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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode r = n;
        while(l1 != null || l2 != null){
            n.next = addNodes(l1, l2, n.next);
            n = n.next;
            if(l1 != null){
                l1 = l1.next;
            } 
            if(l2 != null){
                l2 = l2.next;
            } 
        }
        return r.next;

    }
    private ListNode addNodes(ListNode l1, ListNode l2, ListNode c){      
        int v = 0;
        if(l1 != null){
            v = v + l1.val;
        }
        if(l2 != null){
            v = v + l2.val;
        }
        if(c != null){
            v = v + c.val;
        }

        if(v <= 9){
            return new ListNode(v);
        }else {
            ListNode n = new ListNode(v - 10);
            n.next = new ListNode(1);
            return n;
        }

        // if(l1 != null && l2 != null && c != null){
        //     if(l1.val + l2.val + c.val <= 9){
        //         return new ListNode(l1.val + l2.val + c.val);
        //     }else {
        //         ListNode n = new ListNode(l1.val + l2.val + c.val - 10);
        //         n.next = new ListNode(1);
        //         return n;
        //     }
        // }
        
    }
}