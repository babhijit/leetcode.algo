package com.leetcode.algo.linkedlist.ll2_intersection_160;

import java.util.Objects;
import java.util.Stack;

public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var stackA = new Stack<ListNode>();
        pushNodesToStack(stackA, headA);
        var stackB = new Stack<ListNode>();
        pushNodesToStack(stackB, headB);

        return getIntersectionNode(stackA, stackB);
    }

    private ListNode getIntersectionNode(Stack<ListNode> stackA, Stack<ListNode> stackB) {
        ListNode node = null;
        while(!stackA.isEmpty() && !stackB.isEmpty()) {
            if (stackA.peek() == stackB.peek()) {
                node = stackA.peek();
            } else {
                return node;
            }
            stackA.pop();
            stackB.pop();
        }

        return node;
    }

    private static void pushNodesToStack(Stack<ListNode> stack, ListNode head) {
        for(ListNode node = head; Objects.nonNull(node); node = node.next) {
            stack.push(node);
        }
    }
}
