package com.leetcode.algo.linkedlist.ll2_intersection_160;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListIntersectionTest extends AbstractExecuteTests<TestCase> {

    public LinkedListIntersectionTest() {
        super("LinkedListIntersectionTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        testCase.input.setupListNodes();
        var solution = new LinkedListIntersection();
        var actual = solution.getIntersectionNode(testCase.input.rootA, testCase.input.rootB);
        if (Objects.nonNull(testCase.output.intersectionValue)) {
            assertEquals(testCase.output.intersectionValue.intValue(), actual.val);
        } else {
            assertNull(actual);
        }
    }
}