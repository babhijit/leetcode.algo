package com.leetcode.algo.array.game_of_life;

public class TestCase {
    public final int[][] board;
    public final int[][] expected;

    public TestCase(int[][] board, int[][] expected) {
        this.board = board;
        this.expected = expected;
    }
}
