package com.algorithm.likou.p801_p900;


/**
 * @ClassName:p876_链表的中间结点
 * @Auther: Lyh
 * @Date: 2022/7/1 12:31
 * @Version: v1.0
 */
public class p876_链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
