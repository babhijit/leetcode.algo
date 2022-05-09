package com.leetcode.algo.linkedlist.flatten_nested_list_itr_341;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {
    private final Iterator<Integer> itr;

    public NestedIterator(List<NestedInteger> nestedList) {
        Queue<Integer> queue = new LinkedList<>();
        for (var nestedInteger: nestedList) {
            addToQueue(nestedInteger, queue);
        }
        itr = queue.iterator();
    }

    private void addToQueue(NestedInteger nestedInteger, Queue<Integer> queue) {
        if (nestedInteger.isInteger()) {
            queue.add(nestedInteger.getInteger());
        } else {
            for (var ni: nestedInteger.getList()) {
                addToQueue(ni, queue);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public Integer next() {
        return itr.next();
    }
}
