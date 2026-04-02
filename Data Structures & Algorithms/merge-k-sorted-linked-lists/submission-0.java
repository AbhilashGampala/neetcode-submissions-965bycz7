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
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode dummy=new ListNode();
        ListNode tem=dummy;
        while(!pq.isEmpty()){
            ListNode list=new ListNode();
            list.val=pq.poll();
            tem.next=list;
            tem=tem.next;
        }
        return dummy.next;
    }
}
