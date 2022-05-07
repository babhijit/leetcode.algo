package com.leetcode.algo.stack.max_freq_stack;

import java.util.*;

public final class MaxFreqStack {
    private final Map<Integer, Integer> frequencies;
    private final Map<Integer, Stack<Integer>> stacks;
    private Integer maxFreq;

    public MaxFreqStack() {
        this.frequencies = new HashMap<>();
        this.stacks = new HashMap<>();
        this.maxFreq = null;
    }

    public void push(int val) {
        int freq = this.frequencies.merge(val, 1, Integer::sum);
        var stack = this.stacks.getOrDefault(freq, new Stack<>());
        stack.push(val);
        this.stacks.putIfAbsent(freq, stack);
        if (Objects.isNull(maxFreq) || (freq > maxFreq)) {
            maxFreq = freq;
        }
    }

    public int pop() {
        var stack = this.stacks.get(maxFreq);
        int value = stack.pop();
        if (stack.isEmpty()) {
            this.stacks.remove(maxFreq--);
        }
        this.frequencies.merge(value, -1, Integer::sum);
        return value;
    }
}
