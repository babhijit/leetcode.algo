package com.leetcode.algo.tree.bst.transform.incr_order_st;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "IncreasingBSTTests.json";

    public IncreasingBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var root = new BST(testCase.root, true);
        var expected = new BST(testCase.expected, true);

        var solution = new IncreasingBST();
        var actual = solution.increasingBST(root.root);
        assertTrue(BST.equals(expected.root, actual));
    }
}