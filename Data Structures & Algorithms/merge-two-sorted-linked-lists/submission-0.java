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
        return merge(list1, list2);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }
        int v1 = list1.val;
        int v2 = list2.val;
        if(v1 < v2) {
            return new ListNode(v1, merge(list1.next, list2));
        } else {
            return new ListNode(v2, merge(list1, list2.next));
        }
    }
}