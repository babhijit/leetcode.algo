package com.leetcode.algo.array.game_of_life;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "GameOfLineTests.json";

    public GameOfLifeTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new GameOfLife();
        int[][] board = testCase.board;
        solution.gameOfLife(board);
        assertArrayEquals(testCase.expected, board);
    }
}