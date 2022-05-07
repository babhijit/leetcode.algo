package com.leetcode.algo.array.pattern132_456;

import java.util.Objects;
import java.util.Stack;

/**
 * The solution uses a monotonic stack. The jStack ensures that it stores values in ascending order.
 * Whenever a bigger number is encountered then it ensures that the kElement (aka num[k] gets the
 * biggest baddest element from the stack and then the stack keeps the new **bigger** element.
 * Only elements bigger than **this** element are kept inside the stack.
 *
 * So in the next iteration we try to satisfy the condition num[i] < num[k] only [since jStack keeps
 * the **num[j]** values. If not we try to keep the largest possible **j values** in stack and the highest
 * possible **k** value in kElement (extracted from stack if required)
 */
public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        var jStack = new Stack<Integer>();
        Integer kElement = null;

        for (int i = nums.length - 1; i >= 0; --i) {
            if(Objects.nonNull(kElement) && (nums[i] < kElement))
                return true;

            while (!jStack.isEmpty() && (jStack.peek() < nums[i])) {
                kElement = jStack.pop();
            }

            jStack.push(nums[i]);
        }

        return false;
    }
}
