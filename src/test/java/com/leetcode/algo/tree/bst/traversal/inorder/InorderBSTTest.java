package com.leetcode.algo.tree.bst.traversal.inorder;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InorderBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "InorderBSTTests.json";

    public InorderBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var bst = new BST(testCase.root);
        var expected = Arrays.stream(testCase.expected).toList();
        var solution = new InorderBST();
        var actual = solution.inorderTraversal(bst.root);
        assertEquals(expected, actual);
    }
}