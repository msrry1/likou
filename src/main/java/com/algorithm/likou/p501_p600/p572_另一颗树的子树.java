package com.algorithm.likou.p501_p600;

/**
 * @ClassName:p572_另一颗树的子树
 * @Auther: Lyh
 * @Date: 2022/7/17 12:13
 * @Version: v1.0
 */
public class p572_另一颗树的子树 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){ //子树为null时必为true
            return true;
        }
        if(root == null){ //此时子树不为null，但父树为null
            return false;
        }
        //等于对每个节点都判断了isSametree，只要有一个为true,返回值就是true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSametree(root, subRoot);
    }

    public boolean isSametree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        return isSametree(p.left, q.left) && isSametree(p.right, q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
