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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack=new Stack<>();
        ListNode thead=head;
        ListNode nexth=new ListNode(0);
        ListNode ans=nexth;
        int rev=k;
        while(thead!=null){
            ListNode prev=thead;
            while(rev-->0&&thead!=null){
                stack.push(thead);
                thead=thead.next;
            }
            if(stack.size()!=k){
                nexth.next=prev;
                return ans.next;
            }
            rev=k;
            while(!stack.isEmpty()){
                nexth.next=stack.pop();
                nexth=nexth.next;
            }
            nexth.next=thead;
        }
        return ans.next;
    }
}