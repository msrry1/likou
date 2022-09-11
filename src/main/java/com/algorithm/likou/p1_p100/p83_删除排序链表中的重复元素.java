package com.algorithm.likou.p1_p100;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName:p83_删除排序链表中的重复元素
 * @Auther: Lyh
 * @Date: 2022/7/4 22:44
 * @Version: v1.0
 */
public class p83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new TreeSet();
        ListNode p = head;
        while(p != null){
            set.add(p.val);
            p = p.next;
        }
        ListNode ret = new ListNode();
        p = ret;
        for(Integer c : set){
            ListNode q = new ListNode(c);
            p.next = q;
            p = q;
        }
        return ret.next;
    }
}
