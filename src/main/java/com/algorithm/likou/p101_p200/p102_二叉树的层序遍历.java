package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName:p102_二叉树的层序遍历
 * @Auther: Lyh
 * @Date: 2022/7/8 22:57
 * @Version: v1.0
 */
public class p102_二叉树的层序遍历 {
    List<List<Integer>> ret = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList(size);
            for(int i = 0;i < size;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            ret.add(list);
        }

        return ret;
    }
}
