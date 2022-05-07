package com.leetcode.algo.linkedlist.iterator.peeking_iterator;

import java.util.Iterator;
import java.util.Objects;

public class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private Integer nextValue;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.nextValue = null;
    }

    @Override
    public boolean hasNext() {
        return Objects.nonNull(nextValue) || iterator.hasNext();
    }

    @Override
    public Integer next() {
        Integer value = Objects.nonNull(nextValue) ? nextValue : iterator.next();
        nextValue = null;
        return value;
    }

    public Integer peek() {
        if (Objects.isNull(nextValue)) {
            nextValue = iterator.next();
        }
        return nextValue;
    }
}
