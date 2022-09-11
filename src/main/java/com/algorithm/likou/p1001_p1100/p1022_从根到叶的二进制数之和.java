package com.algorithm.likou.p1001_p1100;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class p1022_从根到叶的二进制数之和 {
    int sum;
    public int sumRootToLeaf(TreeNode root) {

        dfs(0,root);
        return sum;
    }

    //前序遍历
    public void dfs(int sumPart, TreeNode root){

        if(root == null){
            return;
        }
        //此时的和
        sumPart = sumPart*2 + root.val;
        if(root.left == null && root.right == null){
            //到了叶子节点时，将和加入总和
            sum += sumPart;
            return;
        }

        dfs(sumPart, root.left);
        dfs(sumPart, root.right);
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
