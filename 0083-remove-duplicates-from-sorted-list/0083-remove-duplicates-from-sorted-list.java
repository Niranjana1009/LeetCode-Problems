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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode prev=head,curr=head;
        while(prev!=null && curr!=null){
            while(curr!=null && prev.val==curr.val) curr=curr.next;
            prev.next=curr;
            prev=curr;
        }
        return head;
    }
}