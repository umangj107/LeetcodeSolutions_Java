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
    public ListNode mergeNodes(ListNode head) {
        ListNode start = head;
        ListNode end = head.next;
        int currSum = 0;
        
        while(end != null){
            if(end.val == 0){
                start = start.next;
                start.val = currSum;
                currSum = 0;
            } else{
                currSum += end.val;
            }
            end = end.next;
        }
        start.next = null;
        return head.next;
    }
}