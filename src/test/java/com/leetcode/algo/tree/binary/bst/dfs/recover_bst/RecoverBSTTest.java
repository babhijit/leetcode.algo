package com.leetcode.algo.tree.binary.bst.dfs.recover_bst;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.binary.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class RecoverBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "RecoverBSTTests.json";

    public RecoverBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var root = new BinaryTree(testCase.root, true);
        var expected = new BinaryTree(testCase.expected, true);
        var solution = new RecoverBST();

        solution.recoverTree(root.root);
        assertTrue(BinaryTree.equals(expected.root, root.root));
    }
}