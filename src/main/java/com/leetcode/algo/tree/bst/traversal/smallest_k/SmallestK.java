package com.leetcode.algo.tree.bst.traversal.smallest_k;

import com.leetcode.algo.tree.bst.TreeNode;

import java.util.Objects;

public class SmallestK {
    public int kSmallest(TreeNode root, int k) {
        return inorder(root, new int[]{0}, k);
    }

    private int inorder(TreeNode node, int[] order, int k) {
        if (Objects.isNull(node)) {
            return -1;
        }

        int result = inorder(node.left, order, k);
        if (result > -1) {
            return result;
        }
        if (++order[0] == k) {
            return node.val;
        }
        return inorder(node.right, order, k);
    }
}
