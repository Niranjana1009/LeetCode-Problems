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
        ListNode t1=headA,t2=headB;
        int count1=0,count2=0;
        while(t1.next!=null){
            count1++;
            t1=t1.next;
        }
        while(t2.next!=null){
            count2++;
            t2=t2.next;
        }
        if(t1!=t2) return null;
        count1++;
        count2++;
        int extra=Math.abs(count1-count2);
        ListNode temp=null;
        if(count1>count2){
            temp=headA;
        }else{
            temp=headB;
        }
        while(extra-->0) temp=temp.next;
        t1=(count1>count2)?temp:headA;
        t2=(count2>count1)?temp:headB;
        while(t1!=null && t2!=null && t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
}