package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p142_环形链表II
 * @Auther: Lyh
 * @Date: 2022/7/20 16:12
 * @Version: v1.0
 */
public class p142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                return null;
            }
            if(slow == fast){
                ListNode ret = head;
                while(ret != slow){
                    ret = ret.next;
                    slow = slow.next;
                }
                return ret;
            }
        }
        return null;
    }
}
