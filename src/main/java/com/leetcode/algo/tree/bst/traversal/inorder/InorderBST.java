package com.leetcode.algo.tree.bst.traversal.inorder;

import com.leetcode.algo.tree.bst.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InorderBST {
    public List<Integer> inorderTraversal(TreeNode root) {
        var nodes = new ArrayList<Integer>();
        return inorder(root, nodes);
    }

    private List<Integer> inorder(TreeNode root, List<Integer> nodes) {
        if (Objects.nonNull(root)) {
            inorder(root.left, nodes);
            nodes.add(root.val);
            inorder(root.right, nodes);
        }
        return nodes;
    }
}
