package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p25_k个一组翻转链表
 * @Auther: Lyh
 * @Date: 2022/7/23 15:18
 * @Version: v1.0
 */
public class p25_k个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> list = new ArrayList();
        ListNode p = head;
        int n = 0;
        while(p != null){
            list.add(p);
            n++;
            p = p.next;
        }
        n /= k;
        int left = 0;
        int right = k - 1;
        for(int i = 1;i <= n;i++){
            res(list, left, right);
            left += k;
            right += k;
        }
        ListNode dummy = new ListNode();
        p = dummy;
        for(ListNode q : list){
            p.next = q;
            q.next = null;
            p = q;
        }
        return dummy.next;

    }
    public void res(List<ListNode> list, int left, int right){
        while(right > left){
            ListNode t = list.get(left);
            list.set(left, list.get(right));
            list.set(right, t);
            left++;
            right--;
        }
    }
}
