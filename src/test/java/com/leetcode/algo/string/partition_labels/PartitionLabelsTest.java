package com.leetcode.algo.string.partition_labels;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

    private PartitionLabels solution = new PartitionLabels();

    @Test
    void testInput1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = List.of(9, 7, 8);

        assertEquals(expected, solution.partitionLabels(s));
    }

    @Test
    void testInput2() {
        String s = "eccbbbbdec";
        List<Integer> expected = List.of(10);

        assertEquals(expected, solution.partitionLabels(s));
    }

    @Test
    void testInput3() {
        String s = "qiejxqfnqceocmy";
        List<Integer> expected = List.of(13, 1, 1);

        assertEquals(expected, solution.partitionLabels(s));
    }

}