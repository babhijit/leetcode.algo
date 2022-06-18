package com.leetcode.algo.tree.binary.bst.traversal.smallest_k;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.binary.BinaryTree;

import static org.junit.jupiter.api.Assertions.*;

class SmallestKTest  extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "SmallestKTests.json";

    public SmallestKTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var root = new BinaryTree(testCase.input.root, true);
        var solution = new SmallestK();

        assertEquals(testCase.output.expected, solution.kSmallest(root.root, testCase.input.k));
    }
}