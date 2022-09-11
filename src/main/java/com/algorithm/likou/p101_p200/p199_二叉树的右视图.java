package com.algorithm.likou.p101_p200;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName:p199_二叉树的右视图
 * @Auther: Lyh
 * @Date: 2022/7/26 16:43
 * @Version: v1.0
 */
public class p199_二叉树的右视图 {
    /*
    1. 层序遍历二叉树。
    2. 取每一层最右边的点，构成右视图。
*/
    public List<Integer> rightSideView(TreeNode root) {
        // 定义需要返回的变量
        List<Integer> ans = new ArrayList<>();
        // 创建双端队列
        Queue<TreeNode> queue = new ArrayDeque<>();
        // 如果节点不为空
        if (root != null){
            queue.add(root);
        }
        // 如果队列不为空
        while(!queue.isEmpty()){
            // 计算这一层的节点数
            int n = queue.size();
            for(int i =0; i<n;i++){
                // 将当前根节点保存并移除
                TreeNode node = queue.poll(); // 将队列的头结点元素移除
                // 记录当前层最右的根节点
                if (i == n-1) ans.add(node.val);
                // 依次加入当前根节点的左节点与右节点
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return ans;
    }
}
