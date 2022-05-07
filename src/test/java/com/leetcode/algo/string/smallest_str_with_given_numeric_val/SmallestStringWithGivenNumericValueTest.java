package com.leetcode.algo.string.smallest_str_with_given_numeric_val;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestStringWithGivenNumericValueTest {

    private SmallestStringWithGivenNumericValue solution = new SmallestStringWithGivenNumericValue();

    @Test
    void test_n1_k3() {
        int n = 1;
        int k = 3;
        String output = "c";

        assertEquals(output, solution.getSmallestString(n, k));
    }

    @Test
    void test_n2_k3() {
        int n = 2;
        int k = 3;
        String output = "ab";

        assertEquals(output, solution.getSmallestString(n, k));
    }

    @Test
    void test_n3_k4() {
        int n = 3;
        int k = 4;
        String output = "aab";

        assertEquals(output, solution.getSmallestString(n, k));
    }

    @Test
    void test_n3_k27() {
        int n = 3;
        int k = 27;
        String output = "aay";

        assertEquals(output, solution.getSmallestString(n, k));
    }

    @Test
    void test_n3_k29() {
        int n = 3;
        int k = 29;
        String output = "abz";

        assertEquals(output, solution.getSmallestString(n, k));
    }

    @Test
    void test_n5_k73() {
        int n = 5;
        int k = 73;
        String output = "aaszz";

        assertEquals(output, solution.getSmallestString(n, k));
    }

}