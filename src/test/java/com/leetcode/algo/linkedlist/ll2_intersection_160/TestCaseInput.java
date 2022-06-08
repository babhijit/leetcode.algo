package com.leetcode.algo.linkedlist.ll2_intersection_160;

public class TestCaseInput {
    public final int[] headA;
    public final int[] headB;
    public final int skipA;
    public final int skipB;

    public ListNode rootA;
    public ListNode rootB;


    public TestCaseInput(int[] headA, int[] headB, int skipA, int skipB) {
        this.headA = headA;
        this.headB = headB;
        this.skipA = skipA;
        this.skipB = skipB;
    }

    public void setupListNodes() {
        this.rootA = createListFromArray(this.headA);
        this.rootB = createListFromArray(this.headB);

        ListNode commonNode = this.rootA;
        for (int i = 0; i < skipA; ++i) {
            commonNode = commonNode.next;
        }

        ListNode nodeB = this.rootB;
        for (int i = 1; i < skipB; ++i) {
            nodeB = nodeB.next;
        }
        nodeB.next = commonNode;
    }

    private ListNode createListFromArray(int[] values) {
        if (values.length == 0) {
            return null;
        }

        ListNode root = new ListNode(values[0]);
        ListNode node = root;

        for (int i = 1; i < values.length; ++i) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }

        return root;
    }
}
