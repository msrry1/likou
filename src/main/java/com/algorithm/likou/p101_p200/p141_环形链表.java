package com.algorithm.likou.p101_p200;


/**
 * @ClassName:p141_环形链表
 * @Auther: Lyh
 * @Date: 2022/7/3 11:44
 * @Version: v1.0
 */
public class p141_环形链表 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public boolean hasCycle(ListNode head) {
            ListNode p = head;
            ListNode q = head;
            while(p != null && q != null && q.next != null){
                p = p.next;
                q = q.next.next;
                if(p == q){
                    return true;
                }
            }
            return false;
        }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
