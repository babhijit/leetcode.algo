package com.leetcode.algo.array.baseball_game;

public class BaseballGame {
    private int[] scoreBoard;
    private int scoreBoardLength;

    public int calcPoints(String[] ops) {
        final int OPERATIONS = ops.length;
        scoreBoard = new int[OPERATIONS];
        scoreBoardLength = -1;

        int score = 0;

        for (var op: ops) {
            score = processScoreOp(op, score);
        }

        return score;
    }

    private int processScoreOp(String op, final int prevScore) {
        int score = 0;
        switch (op) {
            case "+":
                score = scoreBoard[scoreBoardLength] + scoreBoard[scoreBoardLength - 1];
                break;
            case "D":
                score = 2 * scoreBoard[scoreBoardLength];
                break;
            case "C":
                return prevScore - scoreBoard[scoreBoardLength--];
            default:
                score = Integer.parseInt(op);
        }
        scoreBoard[++scoreBoardLength] = score;

        return score + prevScore;
    }
}
