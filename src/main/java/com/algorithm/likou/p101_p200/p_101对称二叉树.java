package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p_101对称二叉树
 * @Auther: Lyh
 * @Date: 2022/7/7 09:54
 * @Version: v1.0
 */
public class p_101对称二叉树 {
    public boolean deep(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null){
            return true;
        }
        if(n1 == null || n2 == null){
            return false;
        }
        if(n1.val != n2.val){
            return false;
        }
        return deep(n1.left, n2.right) && deep(n1.right, n2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return deep(root.left, root.right);
    }
}
