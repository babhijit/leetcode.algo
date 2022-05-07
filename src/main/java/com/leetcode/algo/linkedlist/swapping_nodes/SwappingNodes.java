package com.leetcode.algo.linkedlist.swapping_nodes;

import java.util.Objects;

public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstK = head;

        for (int i = 1; i < k; ++i) {
            firstK = firstK.next;
        }

        ListNode lastK = head;
        for (ListNode itr = firstK.next; Objects.nonNull(itr); itr = itr.next) {
            lastK = lastK.next;
        }

        swap(firstK, lastK);

        return head;
    }

    private void swap(ListNode a, ListNode b) {
        int t = a.val;
        a.val = b.val;
        b.val = t;
    }
}
