package com.leetcode.algo.array.rotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    private final RotateArray_O1 rotateArray = new RotateArray_O1();
    private final RotateArray_ON rotateArray2 = new RotateArray_ON();

    @Test
    void testExample1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(nums, 3);
        assertArrayEquals(expected, nums);
    }

    @Test
    void testExample2() {
        int[] nums = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};
        rotateArray.rotate(nums, 2);
        assertArrayEquals(expected, nums);
    }

    @Test
    void testExample1_On() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        rotateArray2.rotate(nums, 3);
        assertArrayEquals(expected, nums);
    }

    @Test
    void testExample2_On() {
        int[] nums = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};
        rotateArray2.rotate(nums, 2);
        assertArrayEquals(expected, nums);
    }
}