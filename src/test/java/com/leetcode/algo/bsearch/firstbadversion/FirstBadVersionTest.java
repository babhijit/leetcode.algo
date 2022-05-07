package com.leetcode.algo.bsearch.firstbadversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void test5Input() {
        var firstBadVersion = new FirstBadVersion(4);
        assertEquals(4, firstBadVersion.firstBadVersion(5));
    }

    @Test
    void testLastElementBadInput() {
        var firstBadVersion = new FirstBadVersion(2147483647);
        assertEquals(2147483647, firstBadVersion.firstBadVersion(2147483647));
    }

    @Test
    void testMillionInput() {
        var firstBadVersion = new FirstBadVersion(1_111_221);
        assertEquals(1_111_221, firstBadVersion.firstBadVersion(2_000_000));
    }

    @Test
    void testMassiveInput() {
        var firstBadVersion = new FirstBadVersion(1_702_766_719);
        assertEquals(1_702_766_719, firstBadVersion.firstBadVersion(2_126_753_390));
    }
}