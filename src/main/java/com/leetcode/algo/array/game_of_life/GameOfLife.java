package com.leetcode.algo.array.game_of_life;

public class GameOfLife {
    private static final int ALIVE = 1;
    private static final int DEAD = 0;

    public void gameOfLife(int[][] board) {
        final int ROWS = board.length;
        final int COLUMNS = board[0].length;

        int[][] original = new int[ROWS][];
        for (int i = 0; i < ROWS; ++i) {
            original[i] = board[i].clone();
        }

        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLUMNS; ++col) {
                board[row][col] = getLifeState(original, row, col);
            }
        }
    }

    private int getLifeState(int[][] board, int row, int col) {
        int currentState = board[row][col];

        int lifeCount = getLifeCount(board, row, col);

        if (currentState == ALIVE) {
            if ((lifeCount < 2) || (lifeCount > 3)) {
                return DEAD;
            }
        } else if (currentState == DEAD) {
            if (lifeCount == 3) {
                return ALIVE;
            }
        }

        return currentState;
    }

    private int getLifeCount(final int[][] cells, final int row, final int col) {
        int lifeCount = 0;

        int left = col - 1;
        int right = col + 1;
        int top = row - 1;
        int down = row + 1;

        lifeCount += getCurrentState(cells, top, left);
        lifeCount += getCurrentState(cells, top, right);
        lifeCount += getCurrentState(cells, row, left);
        lifeCount += getCurrentState(cells, row, right);
        lifeCount += getCurrentState(cells, top, col);
        lifeCount += getCurrentState(cells, down, col);
        lifeCount += getCurrentState(cells, down, left);
        lifeCount += getCurrentState(cells, down, right);

        return lifeCount;
    }

    private int getCurrentState(final int[][] board, final int row, final int col) {
        final int ROWS = board.length;
        final int COLUMNS = board[0].length;

        if ((row >= 0) && (row < ROWS) &&
                (col >= 0) && (col < COLUMNS)) {
            return board[row][col];
        }
        return 0;
    }
}
