package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p104_二叉树的最大深度
 * @Auther: Lyh
 * @Date: 2022/7/8 22:50
 * @Version: v1.0
 */
public class p104_二叉树的最大深度 {
    //递归
    //深度等于当前深度加左右孩子之中的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int deep = 1;
        int m = maxDepth(root.left);
        int n = maxDepth(root.right);
        return deep + Math.max(m, n);
    }
}
