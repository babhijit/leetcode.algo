package com.leetcode.algo.tree.bst.dfs.recover_bst;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.*;

class RecoverBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "RecoverBSTTests.json";

    public RecoverBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var root = new BST(testCase.root, true);
        var expected = new BST(testCase.expected, true);
        var solution = new RecoverBST();

        solution.recoverTree(root.root);
        assertTrue(BST.equals(expected.root, root.root));
    }
}