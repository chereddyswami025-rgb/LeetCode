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
    public ListNode reverseList(ListNode head) {
        ListNode temp,fut,prev;
        temp=head;
        prev=null;
        while(temp!=null){
            fut=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fut;

        }
        head=prev;
        return head;
        
    }
}