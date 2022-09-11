package com.algorithm.likou.p101_p200;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName:p116_填充每个节点的下一个右侧节点指针
 * @Auther: Lyh
 * @Date: 2022/7/4 18:50
 * @Version: v1.0
 */
public class p116_填充每个节点的下一个右侧节点指针 {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Deque<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                Node p = queue.poll();

                if(i != size-1){
                    p.next = queue.peek();
                }
                if(p.left != null){
                    queue.offer(p.left);
                }
                if(p.right != null){
                    queue.offer(p.right);
                }
            }
        }
        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
