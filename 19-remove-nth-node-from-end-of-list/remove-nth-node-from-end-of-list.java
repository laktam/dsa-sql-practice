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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        List<ListNode> list = new ArrayList<>();
        int size = 0;
        while(head != null){
            list.add(head);
            head = head.next;
            size++;
        }
        if(size == 1){
            return null;
        }else if(n == 1){
            list.get(size - 2).next = null;
            return node;
        }else if(n == size){
            node = node.next;
            return node;
        }
        list.get(size - (n + 1)).next = list.get(size - (n - 1));
        return node;
    }
    
}