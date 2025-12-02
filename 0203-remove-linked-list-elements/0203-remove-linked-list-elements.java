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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy,curr=head;
        while(curr!=null){
            while(curr!=null && curr.val==val){
                curr=curr.next;
            }
            prev.next=curr;
            prev=curr;
            if(curr!=null) curr=curr.next;
        }
        return dummy.next;
    }
}