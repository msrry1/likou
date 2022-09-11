package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p235_二叉搜索树的最近公共祖先
 * @Auther: Lyh
 * @Date: 2022/7/10 14:38
 * @Version: v1.0
 */
public class p235_二叉搜索树的最近公共祖先 {

    //递归返回祖先
    //祖先就是自己(根节点和自己的一个孩子，或者左右孩子)
    //如果都在左或右，祖先都是左孩子或者右孩子
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

}
