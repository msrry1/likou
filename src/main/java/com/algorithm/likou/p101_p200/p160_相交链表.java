package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p160_相交链表
 * @Auther: Lyh
 * @Date: 2022/7/21 15:09
 * @Version: v1.0
 */
public class p160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        //p走 a + m + b后等于 q 走 b + m + a
        while(p != q){
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }
}
