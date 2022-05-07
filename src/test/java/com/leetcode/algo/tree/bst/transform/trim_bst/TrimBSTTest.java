package com.leetcode.algo.tree.bst.transform.trim_bst;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.*;

class TrimBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "TrimBSTTests.json";

    public TrimBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var input = new BST(testCase.input.root);
        var expected = new BST(testCase.output.expected);

        var solution = new TrimBST();
        var actual = solution.trimBST(input.root, testCase.input.low, testCase.input.high);
        assertTrue(BST.equals(expected.root, actual));
    }
}