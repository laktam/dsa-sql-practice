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
        if(head.next.next == null) return head;
        // get last element
        ListNode last = head;
        ListNode lastOdd = null;
        int i = 0;
        while(last != null){
            if(i % 2 == 0) lastOdd = last;
            if(last.next == null) break;
            last = last.next;
            i++;
        }

        Boolean plusOne = false;
        if(lastOdd.next != null) plusOne = true;

        System.out.println("last odd : " + lastOdd.val);
        ListNode currentOdd = head;
        while(currentOdd != null && currentOdd != lastOdd){
            ListNode currentEven = currentOdd.next;
            currentOdd.next = currentEven.next;
            currentOdd = currentEven.next;
            last.next = currentEven;
            last = currentEven;
            last.next = null;
        }      

        if(plusOne){
            ListNode lastEven = lastOdd.next;
            lastOdd.next = lastEven.next;
            last.next = lastEven;
            lastEven.next = null;
        }
        return head;
    }
}