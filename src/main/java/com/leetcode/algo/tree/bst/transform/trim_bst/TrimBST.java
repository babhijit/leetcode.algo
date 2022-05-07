package com.leetcode.algo.tree.bst.transform.trim_bst;

import com.leetcode.algo.tree.bst.TreeNode;

import java.util.Objects;

public class TrimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (Objects.isNull(root)) {
            return null;
        }

        if (root.val > high) {
            return trimBST(root.left, low, high);
        } else if (root.val < low) {
            return trimBST(root.right, low, high);
        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }
    }
}
