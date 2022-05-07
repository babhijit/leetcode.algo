package com.leetcode.algo.bsearch.search_in_rotated_array_unknown_index;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInRotatedArrayUnknownIndexTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "SearchInRotatedArrayUnknownIndexTests.json";

    public SearchInRotatedArrayUnknownIndexTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    private void executeTest(final int[] nums, int target, boolean expected) {
        var solution = new SearchInRotatedArrayUnknownIndex();
        var actual = solution.search(nums, target);
        if (expected) {
            assertTrue(actual);
        } else {
            assertFalse(actual);
        }
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(testCase.input.nums, testCase.input.target, testCase.output);
    }
}