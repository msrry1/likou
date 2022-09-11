package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p203_移除链表元素
 * @Auther: Lyh
 * @Date: 2022/7/3 13:20
 * @Version: v1.0
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class p203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headNode = new ListNode();
        headNode.next = head;
        ListNode p = headNode;
        while(p.next != null){
            if(val == p.next.val){
                p.next = p.next.next;
            } else{
                p = p.next;
            }
        }
        return headNode.next;
    }
}
