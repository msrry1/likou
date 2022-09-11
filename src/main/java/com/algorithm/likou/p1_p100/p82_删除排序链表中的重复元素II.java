package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p82_删除排序链表中的重复元素II
 * @Auther: Lyh
 * @Date: 2022/7/13 15:58
 * @Version: v1.0
 */
public class p82_删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null){
            ListNode t = cur;
            int flag = 0;
            while(t.next != null && t.next.next != null && t.next.val == t.next.next.val){
                flag = 1;
                t = t.next;
            }
            if(flag == 1){
                cur.next = t.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
