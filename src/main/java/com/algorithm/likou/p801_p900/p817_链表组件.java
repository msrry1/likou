package com.algorithm.likou.p801_p900;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName:p817_链表组件
 * @Auther: Lyh
 * @Date: 2022/10/12 11:30
 * @Version: v1.0
 */
public class p817_链表组件 {
    public int numComponents(ListNode head, int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        while (head != null) {
            if (set.contains(head.val)) {
                while (head != null && set.contains(head.val)){
                    head = head.next;
                }
                ans++;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}
