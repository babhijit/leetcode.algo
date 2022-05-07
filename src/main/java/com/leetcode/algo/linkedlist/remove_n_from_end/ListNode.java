package com.leetcode.algo.linkedlist.remove_n_from_end;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(ListNode itr = this; Objects.nonNull(itr); itr = itr.next) {
            stringBuilder.append(itr.val).append(',');
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
