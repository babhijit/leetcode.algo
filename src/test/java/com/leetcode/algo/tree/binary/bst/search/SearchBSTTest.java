package com.leetcode.algo.tree.binary.bst.search;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.binary.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "SearchBSTTests.json";

    public SearchBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        BinaryTree input = new BinaryTree(testCase.input.root);
        BinaryTree output = new BinaryTree(testCase.output.expected);

        var solution = new SearchBST();
        var actual = solution.searchBST(input.root, testCase.input.val);
        assertTrue(BinaryTree.equals(output.root, actual));
    }
}