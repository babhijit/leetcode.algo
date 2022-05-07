package com.leetcode.algo.linkedlist.merge_2_sorted;

import java.util.Objects;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (Objects.nonNull(list1) && Objects.nonNull(list2)) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        } else if(Objects.nonNull(list1)) {
            return list1;
        } else {
            return list2;
        }
    }
}
