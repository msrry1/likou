package com.algorithm.likou.p201_p300;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName:p232_用栈实现队列
 * @Auther: Lyh
 * @Date: 2022/7/5 22:32
 * @Version: v1.0
 */
public class p232_用栈实现队列 {
    Deque<Integer> out, in;
    public p232_用栈实现队列() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void push(int x) {
        in.addLast(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) out.addLast(in.pollLast());
        }
        return out.pollLast();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) out.addLast(in.pollLast());
        }
        return out.peekLast();
    }

    public boolean empty() {
        return out.isEmpty() && in.isEmpty();
    }
}
