package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p173_二叉搜索树迭代器
 * @Auther: Lyh
 * @Date: 2022/7/27 15:15
 * @Version: v1.0
 */
public class p173_二叉搜索树迭代器 {
    class BSTIterator {
        private int idx;
        private List<Integer> arr;

        public BSTIterator(TreeNode root) {
            idx = 0;
            arr = new ArrayList<Integer>();
            inorderTraversal(root, arr);
        }

        public int next() {
            return arr.get(idx++);
        }

        public boolean hasNext() {
            return idx < arr.size();
        }

        private void inorderTraversal(TreeNode root, List<Integer> arr) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left, arr);
            arr.add(root.val);
            inorderTraversal(root.right, arr);
        }
    }

}
