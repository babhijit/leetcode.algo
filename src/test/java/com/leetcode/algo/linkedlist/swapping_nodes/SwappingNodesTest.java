package com.leetcode.algo.linkedlist.swapping_nodes;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwappingNodesTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "SwappingNodesTests.json";

    public SwappingNodesTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        ListNode head = createLinkedList(testCase.input.head);
        executeTest(head, testCase.input.k, testCase.output);
    }

    private void executeTest(ListNode head, int k, String expected) {
        var solution = new SwappingNodes();
        var actualList = solution.swapNodes(head, k);
        var actual = actualList.toString();
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