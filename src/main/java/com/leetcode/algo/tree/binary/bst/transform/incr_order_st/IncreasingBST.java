package com.leetcode.algo.tree.binary.bst.transform.incr_order_st;

import com.leetcode.algo.tree.binary.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        if (Objects.isNull(root)) {
            return null;
        }
        var preOrderNodes = new LinkedList<TreeNode>();
        preOrder(root, preOrderNodes);
        return rightLeaningTree(preOrderNodes);
    }

    private void preOrder(TreeNode node, Queue<TreeNode> nodes) {
        if (Objects.isNull(node)) {
            return;
        }

        if (Objects.nonNull(node.left)) {
            preOrder(node.left, nodes);
        }
        nodes.offer(node);
        if (Objects.nonNull(node.right))
            preOrder(node.right, nodes);
    }

    private TreeNode rightLeaningTree(Queue<TreeNode> nodes) {
        TreeNode root = nodes.poll();
        TreeNode cur = root;
        while (!nodes.isEmpty()) {
            cur.left = null;
            cur.right = nodes.poll();
            cur = cur.right;
        }
        cur.left = cur.right = null;
        return root;
    }
}
