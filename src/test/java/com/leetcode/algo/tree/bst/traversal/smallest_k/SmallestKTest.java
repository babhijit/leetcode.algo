package com.leetcode.algo.tree.bst.traversal.smallest_k;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.*;

class SmallestKTest  extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "SmallestKTests.json";

    public SmallestKTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var root = new BST(testCase.input.root, true);
        var solution = new SmallestK();

        assertEquals(testCase.output.expected, solution.kSmallest(root.root, testCase.input.k));
    }
}