package com.leetcode.algo.array.prefect_card_2player;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class PerfectCard2PlayerTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "PerfectCard2PlayerTests.json";

    public PerfectCard2PlayerTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new PerfectCard2Player();
        assertEquals(testCase.output, solution.play(testCase.input));
    }
}