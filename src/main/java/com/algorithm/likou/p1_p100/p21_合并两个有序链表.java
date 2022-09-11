package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p21_合并两个有序链表
 * @Auther: Lyh
 * @Date: 2022/7/3 12:01
 * @Version: v1.0
 */
public class p21_合并两个有序链表 {
    ListNode head = new ListNode();
    ListNode q = head;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        ListNode p = list2;
        head.next = list1;
        while(p != null){
            int now = p.val;
            ListNode t = new ListNode(now);
            //将t插入到list1链表中
            int flag = 0;
            while(q.next != null){
                if(now <= q.next.val){
                    t.next = q.next;
                    q.next = t;
                    flag = 1;
                    break;
                }
                q = q.next;
            }
            if(flag == 0){
                q.next = t;
            }
            p = p.next;
        }
        return head.next;
    }
}
