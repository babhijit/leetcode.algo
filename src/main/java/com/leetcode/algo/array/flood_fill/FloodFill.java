package com.leetcode.algo.array.flood_fill;

public class FloodFill {
    boolean[][] marked;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColour) {
        final int N = image.length;
        marked = new boolean[N][];
        for (int i = 0; i < N; ++i) {
            marked[i] = new boolean[image[i].length];
        }

        floodFill(image, sr, sc, image[sr][sc], newColour);
        return image;
    }

    private void floodFill(int[][] image, final int row, final int col, final int oldColour, final int newColour) {
        if (image[row][col] != oldColour) {
            return;
        }
        image[row][col] = newColour;
        marked[row][col] = true;

        // UP
        if (row > 0) {
            if (!marked[row - 1][col]) {
                floodFill(image, row - 1, col, oldColour, newColour);
            }
        }
        // RIGHT
        if (col < image[row].length - 1) {
            if (!marked[row][col + 1]) {
                floodFill(image, row, col + 1, oldColour, newColour);
            }
        }
        // LEFT
        if (col > 0) {
            if (!marked[row][col - 1]) {
                floodFill(image, row, col - 1, oldColour, newColour);
            }
        }
        // BOTTOM
        if (row < image.length - 1) {
            if (!marked[row + 1][col]) {
                floodFill(image, row + 1, col, oldColour, newColour);
            }
        }
    }

}
