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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        if(list1!=null && list2==null) return list1;
        if(list1==null && list2!=null) return list2;
        ListNode head=null,t1=list1,t2=list2;
        ListNode temp=head;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                if(head==null) {
                    head=t1;
                    temp=head;
                }
                else {
                    temp.next=t1;
                    temp=t1;
                }
                t1=t1.next;
            }else{
                if(head==null){
                    head=t2;
                    temp=head;
                }
                else {
                    temp.next=t2;
                    temp=t2;
                }
                t2=t2.next;
            }
        }
        if(temp!=null && t1!=null) temp.next=t1;
        if(temp!=null && t2!=null) temp.next=t2;
        return head;
    }
}