package com.leetcode.algo.array.flood_fill;

public class TestCaseInput {
    public final int[][]  image;
    public final int sr;
    public final int sc;
    public final int newColour;

    public TestCaseInput(int[][] image, int sr, int sc, int newColour) {
        this.image = image;
        this.sr = sr;
        this.sc = sc;
        this.newColour = newColour;
    }
}
