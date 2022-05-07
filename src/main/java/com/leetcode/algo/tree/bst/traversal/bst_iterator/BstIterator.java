package com.leetcode.algo.tree.bst.traversal.bst_iterator;

import com.leetcode.algo.tree.bst.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BstIterator {
    private final Queue<TreeNode> inorder = new LinkedList<>();

    public BstIterator(TreeNode root) {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (Objects.isNull(node)) {
            return;
        }

        inorder(node.left);
        this.inorder.add(node);
        inorder(node.right);
    }

    public int next() {
        return this.inorder.remove().val;
    }

    public boolean hasNext() {
        return this.inorder.size() > 0;
    }
}
