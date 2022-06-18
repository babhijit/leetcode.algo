package com.leetcode.algo.tree.binary.binary_cameras_968;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.binary.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeCamerasTest extends AbstractExecuteTests<TestCase> {
    public BinaryTreeCamerasTest() {
        super("BinaryTreeCamerasTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var binaryTree = new BinaryTree(testCase.root, true);
        var solution = new BinaryTreeCameras();
        assertEquals(testCase.output, solution.minCameraCover(binaryTree.root));
    }
}