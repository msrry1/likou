package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p337_打家劫舍III
 * @Auther: Lyh
 * @Date: 2022/9/26 21:57
 * @Version: v1.0
 */
public class p337_打家劫舍III {
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    //0 不选 1 选
    public int[] dfs(TreeNode root){
        if(root == null){
            return new int[] {0,0};
        }
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int xuan = root.val + l[0] + r[0];
        int buXuan = Math.max(l[0],l[1]) + Math.max(r[0],r[1]);
        return new int[] {buXuan, xuan};
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
