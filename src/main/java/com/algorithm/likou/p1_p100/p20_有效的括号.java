package com.algorithm.likou.p1_p100;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @ClassName:p20_有效的括号
 * @Auther: Lyh
 * @Date: 2022/7/5 21:59
 * @Version: v1.0
 */
public class p20_有效的括号 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                //如果是右括号
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                //如果不是右括号
                //入栈
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
