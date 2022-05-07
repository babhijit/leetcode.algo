package com.leetcode.algo.linkedlist.remove_n_from_end;

import java.util.Objects;

public class RemoveNodeEndN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(0, head);

        ListNode fast = head;
        for (int i = 0; i < n; ++i) {
            fast = fast.next;
        }

        ListNode xPrev = sentinel;
        while(Objects.nonNull(fast)) {
            fast = fast.next;
            xPrev = xPrev.next;
        }

        xPrev.next = xPrev.next.next;

        return sentinel.next;
    }
}
