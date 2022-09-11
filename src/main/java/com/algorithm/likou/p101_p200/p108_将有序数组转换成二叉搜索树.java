package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p108_将有序数组转换成二叉搜索树
 * @Auther: Lyh
 * @Date: 2022/7/25 17:15
 * @Version: v1.0
 */
public class p108_将有序数组转换成二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }
}
