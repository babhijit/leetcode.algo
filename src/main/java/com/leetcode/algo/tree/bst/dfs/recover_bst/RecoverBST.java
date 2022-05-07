package com.leetcode.algo.tree.bst.dfs.recover_bst;

import com.leetcode.algo.tree.bst.TreeNode;

import java.util.Objects;

public class RecoverBST {
    private TreeNode previousNode = null;
    private TreeNode firstBadNode = null;
    private TreeNode secondBadNode = null;


    public void recoverTree(TreeNode root) {
        inorder(root);

        swap(firstBadNode, secondBadNode);
    }

    private void inorder(TreeNode node) {
        if (Objects.isNull(node))  {
            return;
        }

        inorder(node.left);

        // if nothing has been set yet... the left most leaf is most likely candidate
        if (Objects.isNull(firstBadNode) && (Objects.nonNull(previousNode) && (previousNode.val >= node.val)) ) {
            firstBadNode = previousNode;
        }

        // if first has already been set then check for the second one
        if (Objects.nonNull(firstBadNode) && (previousNode.val >= node.val)) {
            secondBadNode = node;
        }

        // keep track of the current node as we descend to the "bigger nodes"
        previousNode = node;

        inorder(node.right);
    }

    private void swap(TreeNode a, TreeNode b) {
        int t = a.val;
        a.val = b.val;
        b.val = t;
    }
}
