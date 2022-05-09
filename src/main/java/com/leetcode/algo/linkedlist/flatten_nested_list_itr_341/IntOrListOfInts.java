package com.leetcode.algo.linkedlist.flatten_nested_list_itr_341;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class IntOrListOfInts implements NestedInteger {
    private Integer value = null;
    private List<NestedInteger> nestedList = null;

    public IntOrListOfInts() {

    }

    public IntOrListOfInts(Integer value) {
        this.value = value;
    }

    public IntOrListOfInts(Collection<Integer> values) {
        nestedList = new ArrayList<>();
        values.forEach(val -> nestedList.add(new IntOrListOfInts(val)));
    }

    public IntOrListOfInts(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
    }

    public void add(Integer item) {
        if (Objects.nonNull(nestedList)) {
            nestedList.add(new IntOrListOfInts(item));
        } else if (Objects.nonNull(value)) {
            nestedList = new ArrayList<>();
            nestedList.add(new IntOrListOfInts(value));
            nestedList.add(new IntOrListOfInts(item));
            value = null;
        } else {
            value = item;
        }
    }

    public void add(NestedInteger nestedInteger) {
        if (Objects.isNull(nestedList)) {
            nestedList = new ArrayList<>();
            if (Objects.nonNull(value)) {
                nestedList.add(new IntOrListOfInts(value));
                value = null;
            }
        }

        nestedList.add(nestedInteger);
    }

    @Override
    public boolean isInteger() {
        return Objects.nonNull(value);
    }

    @Override
    public Integer getInteger() {
        return this.value;
    }

    @Override
    public List<NestedInteger> getList() {
        if (Objects.nonNull(nestedList)) {
            return nestedList;
        }

        return null;
    }
}
