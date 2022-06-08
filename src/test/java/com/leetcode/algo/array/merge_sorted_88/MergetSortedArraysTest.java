package com.leetcode.algo.array.merge_sorted_88;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class MergetSortedArraysTest extends AbstractExecuteTests<TestCase> {
    public MergetSortedArraysTest() {
        super("MergetSortedArraysTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new MergetSortedArrays();
        solution.merge(
                testCase.input.nums1,
                testCase.input.m,
                testCase.input.nums2,
                testCase.input.n);
        assertArrayEquals(testCase.output, testCase.input.nums1);
    }
}