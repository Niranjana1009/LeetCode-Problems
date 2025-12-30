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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        ListNode last=head;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null) {
                pq.add(temp);
                temp=temp.next;
            }
        }
        if(!pq.isEmpty()) head=pq.poll();
        last=head;
        while(!pq.isEmpty()) {
            last.next=pq.poll();
            last=last.next;
        }
        if(last!=null) last.next=null;
        return head;
    }
}