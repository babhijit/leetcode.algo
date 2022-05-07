package com.leetcode.algo.tree.bst.search;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "SearchBSTTests.json";

    public SearchBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        BST input = new BST(testCase.input.root);
        BST output = new BST(testCase.output.expected);

        var solution = new SearchBST();
        var actual = solution.searchBST(input.root, testCase.input.val);
        assertTrue(BST.equals(output.root, actual));
    }
}