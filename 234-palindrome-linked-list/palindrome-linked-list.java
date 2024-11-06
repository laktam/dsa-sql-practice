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
        if(head == null || head.next == null){
            return true;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode cursor = head;
        while(cursor != null){
            list.add(cursor);
            cursor = cursor.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while(l < r){
            if(list.get(l).val != list.get(r).val){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}