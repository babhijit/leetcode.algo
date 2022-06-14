package com.leetcode.algo.dp.triangle_120;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends AbstractExecuteTests<TestCase> {
    public TriangleTest() {
        super("TriangleTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new Triangle();
        List<List<Integer>> triangle = toList(testCase.triangle);
        int actual = solution.minimumTotal(triangle);
        assertEquals(testCase.output, actual);
    }

    private List<List<Integer>> toList(int[][] triangle) {
        List<List<Integer>> triangleList = new ArrayList<>();
        for (int[] row: triangle) {
            triangleList.add(Arrays.stream(row).boxed().toList());
        }
        return triangleList;
    }
}