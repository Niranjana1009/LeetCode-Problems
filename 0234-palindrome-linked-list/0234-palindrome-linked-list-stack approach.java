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
        Stack<Integer> stack=new Stack<>();
        ListNode p=head;
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        p=head;
        while(p!=null && stack.size()!=0){
            if(p.val==stack.peek()){
                stack.pop();
            }else{
                return false;
            }
            p=p.next;
        }
        return true;
    }
}