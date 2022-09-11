package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p24_两两交换链表中的节点
 * @Auther: Lyh
 * @Date: 2022/7/22 19:27
 * @Version: v1.0
 */
public class p24_两两交换链表中的节点 {
    //返回交换之后的头结点
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) { //如果要操作的链表为null或只有一个
            return head;
        }
        //定义返回头指针指向第二个
        ListNode newHead = head.next;
        //head.next应该指向以第三个节点为头结点返回的操作完成的头结点
        head.next = swapPairs(newHead.next);
        //进行交换
        newHead.next = head;
        return newHead;
    }
}
