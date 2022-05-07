package com.leetcode.algo.array.container_with_most_water;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int cmp = compare(height, start, end);
            int distance = end - start;
            int minHeight;
            if (cmp < 0) {
                minHeight = height[start++];
            } else if (cmp > 0) {
                minHeight = height[end--];
            } else {
                minHeight = height[start];
                ++start;
                --end;
            }
            int area = distance * minHeight;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    private int compare(final int[] height, final int a, final int b) {
        final int A = height[a];
        final int B = height[b];
        return Integer.compare(A, B);
    }
}
