package com.leetcode.algo.tree.binary.bst.transform.convert_to_greater_tree;

import com.leetcode.algo.AbstractExecuteTests;
import com.leetcode.algo.tree.binary.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConvertToGreaterBSTTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "ConvertToGreaterBSTTests.json";

    public ConvertToGreaterBSTTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var input = new BinaryTree(testCase.root);
        var expected = new BinaryTree(testCase.expected);

        var solution = new ConvertToGreaterBST();
        var actual = solution.convertBST(input.root);
        assertTrue(BinaryTree.equals(expected.root, actual));
    }
}