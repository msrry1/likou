package com.algorithm.likou.p101_p200;

import java.util.Stack;

/**
 * @ClassName:p155_最小栈
 * @Auther: Lyh
 * @Date: 2022/7/24 14:13
 * @Version: v1.0
 */
public class p155_最小栈 {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> min_stack;
        public MinStack() {
            stack = new Stack<>();
            min_stack = new Stack<>();
        }
        public void push(int x) {
            stack.push(x);
            if(min_stack.isEmpty() || x <= min_stack.peek())
                min_stack.push(x);
        }
        public void pop() {
            if(stack.pop().equals(min_stack.peek()))
                min_stack.pop();
        }
        public int top() {
            return stack.peek();
        }
        public int getMin() {
            return min_stack.peek();
        }
    }

}
