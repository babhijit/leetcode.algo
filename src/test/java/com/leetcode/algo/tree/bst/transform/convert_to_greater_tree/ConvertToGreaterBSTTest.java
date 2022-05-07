package com.leetcode.algo.tree.bst.transform.convert_to_greater_tree;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.bst.BST;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConvertToGreaterBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "ConvertToGreaterBSTTests.json";

    public ConvertToGreaterBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var input = new BST(testCase.root);
        var expected = new BST(testCase.expected);

        var solution = new ConvertToGreaterBST();
        var actual = solution.convertBST(input.root);
        assertTrue(BST.equals(expected.root, actual));
    }
}