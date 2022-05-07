package com.leetcode.algo.linkedlist.middle;

import java.util.Objects;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode middle = head;

        if (Objects.isNull(cur) || Objects.isNull(cur.next)) {
            return middle;
        }

        cur = cur.next;

        while (Objects.nonNull(cur)) {
            cur = cur.next;
            middle = middle.next;
            if(Objects.nonNull(cur)) {
                cur = cur.next;
            }
        }

        return middle;
    }
}
