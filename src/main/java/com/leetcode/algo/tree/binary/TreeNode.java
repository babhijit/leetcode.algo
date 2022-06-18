package com.leetcode.algo.tree.binary;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
        this(0);
    }

    public TreeNode(int val) {
        this(val, null, null);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
