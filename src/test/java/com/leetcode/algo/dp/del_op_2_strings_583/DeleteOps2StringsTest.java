package com.leetcode.algo.dp.del_op_2_strings_583;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class DeleteOps2StringsTest extends AbstractExecuteTests<TestCase> {

    public DeleteOps2StringsTest() {
        super("DeleteOps2StringsTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new DeleteOps2Strings();
        int actual = solution.minDistance(testCase.input.word1, testCase.input.word2);
        assertEquals(testCase.output, actual);
    }
}