package com.leetcode.algo.string.bksp_string_cmp;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompare_O1SpaceTest extends AbstractExecuteTests<TestCase> {
    public BackspaceStringCompare_O1SpaceTest() {
        super("BackspaceStringCompareTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new BackspaceStringCompare_O1Space();
        Boolean expected = testCase.output;
        String s = testCase.input.s;
        String t = testCase.input.t;
        Boolean actual = solution.backspaceCompare(s, t);
        assertEquals(expected, actual);
    }

}