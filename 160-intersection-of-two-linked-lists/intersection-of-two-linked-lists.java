/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode firstCommunNode = null;
        ListNode headACopy = headA;
        ListNode headBCopy = headB;
        while(headACopy != null){
            headBCopy = headB;
            while(headBCopy != null){
                if(headACopy == headBCopy) return headACopy;
                else headBCopy = headBCopy.next;
            }
            headACopy = headACopy.next; 
        }
        return null;
    }
}