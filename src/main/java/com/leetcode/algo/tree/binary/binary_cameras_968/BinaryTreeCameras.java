package com.leetcode.algo.tree.binary.binary_cameras_968;

import com.leetcode.algo.tree.binary.TreeNode;

import java.util.HashSet;
import java.util.Set;

import static java.util.Objects.isNull;

public class BinaryTreeCameras {
    private int cameraCount = 0;
    private Set<TreeNode> coveredNodes;

    public int minCameraCover(TreeNode root) {
        cameraCount = 0;
        coveredNodes = new HashSet<>();
        // this should allow unchecked node insertion to coveredNodes
        coveredNodes.add(null);

        dfs(null, root);

        return cameraCount;
    }

    private void dfs(TreeNode parent, TreeNode node) {
        if (isNull(node)) {
            return;
        }

        dfs(node, node.left);
        dfs(node, node.right);

        // install camera when either of the children do not have cameras installed
        boolean canInstallCamera = !areChildrenCovered(node);

        // additional check for root node
        if (!canInstallCamera && isNull(parent)) {
            canInstallCamera = !coveredNodes.contains(node);
        }

        if (canInstallCamera) {
            installCamera(parent, node);
        }
    }

    private boolean areChildrenCovered(TreeNode node) {
        return coveredNodes.contains(node.left) && coveredNodes.contains(node.right);
    }

    private void installCamera(TreeNode parent, TreeNode node) {
        coveredNodes.add(node);
        coveredNodes.add(node.left);
        coveredNodes.add(node.right);
        coveredNodes.add(parent);
        ++cameraCount;
    }
}
