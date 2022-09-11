package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p206_反转链表
 * @Auther: Lyh
 * @Date: 2022/7/4 22:37
 * @Version: v1.0
 */
public class p206_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode ret = new ListNode();
        ListNode p = head;
        while(p != null){
            ListNode q = new ListNode(p.val);
            q.next = ret.next;
            ret.next = q;

            p = p.next;
        }
        return ret.next;
    }
}
