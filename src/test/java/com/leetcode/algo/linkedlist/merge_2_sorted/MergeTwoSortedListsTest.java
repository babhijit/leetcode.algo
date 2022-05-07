package com.leetcode.algo.linkedlist.merge_2_sorted;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest extends AbstractExecuteTests<TestCaseRecord> {

    private static final String FILE_NAME = "MergeTwoSortedListsTests.json";

    public MergeTwoSortedListsTest() {
        super(FILE_NAME, TestCaseRecord.class);
    }

    @Override
    protected void executeTest(TestCaseRecord testCase) {
        executeTest(createLinkedList(testCase.input.list1), createLinkedList(testCase.input.list2), createLinkedList(testCase.output.output));
    }

    private void executeTest(ListNode list1, ListNode list2, ListNode expected) {
        var solution = new MergeTwoSortedLists();
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(toString(expected), toString(actual));
    }

    private String toString(ListNode list) {
        if (Objects.isNull(list)) {
            return "[]";
        }
        return list.toString();
    }

    private ListNode createLinkedList(final int[] values) {
        ListNode node = null;
        for (int i = values.length - 1; i >= 0 ; --i) {
            node = new ListNode(values[i], node);
        }
        return node;
    }
}