package com.leetcode.algo.backtrack.n_queens_51;

import java.util.*;

public class NQueens {
    private int dimensions;
    private Set<List<String>> validQueenPositions;
    private int[] queenColumnPositions;

    public List<List<String>> solveNQueens(int n) {
        dimensions = n;
        queenColumnPositions = new int[dimensions];
        validQueenPositions = new HashSet<>();

        boolean[][] board = new boolean[n][n];

        processBoardForQueens(board, 0);

        return new LinkedList<>(validQueenPositions);
    }

    private void processBoardForQueens(boolean[][] board, int row) {
        int column = getQueenPositionForRow(board, row);
        if (column < 0) {
            return;
        }

        if (row == dimensions - 1) {
            queenColumnPositions[row] = column;
            addQueenPosition(queenColumnPositions);
        } else {
            for (int c = column; c < dimensions; ++c) {
                if (!board[row][c]) {
                    var playingBoard = copyBoard(board);
                    queenColumnPositions[row] = c;
                    occupyBoardForQueen(playingBoard, row, c);
                    processBoardForQueens(playingBoard, row + 1);
                }
            }
        }
    }

    private boolean[][] copyBoard(boolean[][] board) {
        var newBoard = new boolean[dimensions][dimensions];
        for (int i = 0; i < dimensions; ++i) {
            newBoard[i] = Arrays.copyOf(board[i], dimensions);
        }
        return newBoard;
    }

    private void addQueenPosition(int[] queenPositions) {
        List<String> queenPositionInRows = new LinkedList<>();
        for (int i = 0; i < dimensions; ++i) {
            var queenPosRepr = new char[dimensions];
            Arrays.fill(queenPosRepr, '.');
            queenPosRepr[queenPositions[i]] = 'Q';
            queenPositionInRows.add(new String(queenPosRepr));
        }
        validQueenPositions.add(queenPositionInRows);
    }

    private void occupyBoardForQueen(boolean[][] board, int r, int c) {
        setEntireRowAsOccupied(board, r);
        setEntireColumnAsOccupied(board, c);
        setDiagonalsAsOccupied(board, r, c);
    }

    private int getQueenPositionForRow(boolean[][] board, int r) {
        for (int c = 0; c < dimensions; ++c) {
            if (!board[r][c]) {
                return c;
            }
        }

        return -1;
    }

    private void setBoardPositionAsOccupied(boolean[][] board, int r, int c) {
        if ((r >= 0) && (r < dimensions)) {
            if ((c >= 0) && (c < dimensions)) {
                board[r][c] = true;
            }
        }
    }

    private void setDiagonalsAsOccupied(boolean[][] board, int row, int column) {
        for (int r = 0; r < dimensions; ++r) {
            int depth = row - r;
            if (depth == 0) {
                continue;
            }
            setBoardPositionAsOccupied(board, row + depth, column + depth);
            setBoardPositionAsOccupied(board, row + depth, column - depth);
            setBoardPositionAsOccupied(board, row - depth, column + depth);
            setBoardPositionAsOccupied(board, row - depth, column - depth);
        }
    }

    private void setEntireColumnAsOccupied(boolean[][] board, int c) {
        for (int r = 0; r < dimensions; ++r) {
            board[r][c] = true;
        }
    }

    private void setEntireRowAsOccupied(boolean[][] board, int r) {
        for (int c = 0; c < dimensions; ++c) {
            board[r][c] = true;
        }
    }
}
