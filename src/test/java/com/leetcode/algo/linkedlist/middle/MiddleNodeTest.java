package com.leetcode.algo.linkedlist.middle;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleNodeTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "MiddleNodeTests.json";

    public MiddleNodeTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        ListNode head = createLinkedList(testCase.input.head);
        executeTest(head, testCase.output);
    }

    private void executeTest(ListNode head, String expected) {
        var solution = new MiddleNode();
        var middleNode = solution.middleNode(head);
        var actual = middleNode.toString();
        assertEquals(expected, actual);
    }

    private ListNode createLinkedList(final int[] values) {
        ListNode node = null;
        for (int i = values.length - 1; i >= 0 ; --i) {
            node = new ListNode(values[i], node);
        }
        return node;
    }
}