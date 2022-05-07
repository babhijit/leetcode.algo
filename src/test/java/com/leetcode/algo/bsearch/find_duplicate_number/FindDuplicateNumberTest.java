package com.leetcode.algo.bsearch.find_duplicate_number;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDuplicateNumberTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "DuplicateNumber.json";
    public FindDuplicateNumberTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCaseRecord) {
        executeTestCase(testCaseRecord.input, testCaseRecord.output);
    }

    private void executeTestCase(final int[] nums, final int exptected) {
        FindDuplicateNumber solution = new FindDuplicateNumber();
        int actual = solution.findDuplicate(nums);
        assertEquals(exptected, actual);
    }
}