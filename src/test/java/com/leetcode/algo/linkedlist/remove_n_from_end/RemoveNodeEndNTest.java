package com.leetcode.algo.linkedlist.remove_n_from_end;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNodeEndNTest extends AbstractExecuteTests<TestCaseRecord> {
    private static final String FILE_NAME = "RemoveNodeEndNTests.json";

    public RemoveNodeEndNTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        ListNode head = createLinkedList(testCase.input.head);
        executeTest(head, testCase.input.n, testCase.output);
    }

    private void executeTest(ListNode head, int n, String expected) {
        var solution = new RemoveNodeEndN();
        var actualList = solution.removeNthFromEnd(head, n);
        var actual = Objects.nonNull(actualList) ? actualList.toString() : "[]";
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