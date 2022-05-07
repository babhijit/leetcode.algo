package com.leetcode.algo.stack.validate_stack_seq;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) {
            throw new IllegalArgumentException("The lengths of pushed and popped arrays do not match!");
        }

        Stack<Integer> stack = new Stack<>();

        int popIndex = 0;
        for (int e : pushed) {
            stack.push(e);

            while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                stack.pop();
                ++popIndex;
            }
        }

        return stack.isEmpty();
    }
}
