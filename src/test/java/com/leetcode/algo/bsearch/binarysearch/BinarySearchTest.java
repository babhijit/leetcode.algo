package com.leetcode.algo.bsearch.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertEquals(-1, binarySearch.search(nums, 0));
    }

    @Test
    void test1ElementArray() {
        int[] nums = {2};
        assertEquals(-1, binarySearch.search(nums, 0));
        assertEquals(0, binarySearch.search(nums, 2));
    }

    @Test
    void test2ElementsArray() {
        int[] nums = {2, 3};
        assertEquals(-1, binarySearch.search(nums, 0));
        assertEquals(0, binarySearch.search(nums, 2));
        assertEquals(1, binarySearch.search(nums, 3));
        assertEquals(-1, binarySearch.search(nums, 4));
    }

    @Test
    void test5ElementsArray() {
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(-1, binarySearch.search(nums, 0));
        assertEquals(0, binarySearch.search(nums, 1));
        assertEquals(-1, binarySearch.search(nums, 2));
        assertEquals(1, binarySearch.search(nums, 3));
        assertEquals(-1, binarySearch.search(nums, 4));
        assertEquals(2, binarySearch.search(nums, 5));
        assertEquals(-1, binarySearch.search(nums, 6));
        assertEquals(3, binarySearch.search(nums, 7));
        assertEquals(-1, binarySearch.search(nums, 8));
        assertEquals(4, binarySearch.search(nums, 9));
    }
}