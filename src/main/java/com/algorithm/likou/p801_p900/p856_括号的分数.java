package com.algorithm.likou.p801_p900;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName:p856_括号的分数
 * @Auther: Lyh
 * @Date: 2022/10/9 16:05
 * @Version: v1.0
 */
public class p856_括号的分数 {
    public int scoreOfParentheses(String s) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addLast(0);
        for (char c : s.toCharArray()) {
            if (c == '(') d.addLast(0);
            else {
                int cur = d.pollLast();
                d.addLast(d.pollLast() + Math.max(cur * 2 , 1));
            }
        }
        return d.peekLast();
    }

}
