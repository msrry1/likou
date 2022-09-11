package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p117_填充每个节点的下一个右侧节点指针II
 * @Auther: Lyh
 * @Date: 2022/7/17 11:26
 * @Version: v1.0
 */
public class p117_填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        // Queue<Node> queue = new LinkedList();
        // queue.offer(root);
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i = 0;i < size;i++){
        //         Node p = queue.poll();
        //         if(p.left != null){
        //             queue.offer(p.left);
        //         }
        //         if(p.right != null){
        //             queue.offer(p.right);
        //         }
        //         if(i != size-1){
        //             p.next = queue.peek();
        //         } else{
        //             p.next = null;
        //         }
        //     }
        // }
        //当前层遍历的节点
        Node cur = root;
        while(cur != null){
            //每次构建下一层的链表
            Node dummy = new Node();
            //用于构建下一层的链表
            Node pre = dummy;
            while(cur != null){
                //如果当前层的左孩子存在，构建下一层的链表
                if(cur.left != null){
                    pre.next = cur.left;
                    pre = pre.next;
                }
                //同上
                if(cur.right != null){
                    pre.next = cur.right;
                    pre = pre.next;
                }
                //遍历当前层
                cur = cur.next;
            }
            //当前层变为下一层
            cur = dummy.next;
        }
        return root;
    }
}
