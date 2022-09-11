package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p19_删除链表的倒数第n个结点
 * @Auther: Lyh
 * @Date: 2022/7/1 11:25
 * @Version: v1.0
 */
public class p19_删除链表的倒数第n个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode p = head;
        while(p != null){
            length++;
            p = p.next;
        }
        int del = length - n;
        int i = 1;
        p = head;
        while(i < del){
            i++;
            p = p.next;
        }
        if(del == 0){
            return head.next;
        }
        p.next = p.next.next;
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
