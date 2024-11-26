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
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;
        while(head != null){
            stack.push(head);
            head = head.next;
        }

        int mid = stack.size() / 2;
        for(int i = 0; i < mid; i++){
            if(tmp.val != stack.pop().val) return false;
            tmp = tmp.next;
        }
        return true;
    }
}