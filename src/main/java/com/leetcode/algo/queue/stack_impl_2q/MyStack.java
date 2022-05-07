package com.leetcode.algo.queue.stack_impl_2q;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> q1 = new LinkedList<>();
    private final Queue<Integer> q2 = new LinkedList<>();

    private Queue<Integer> qPtr;

    public MyStack() {
        qPtr = q1;
    }

    public void push(int x) {
        qPtr = getNextQueue();
        qPtr.add(x);
        var oPtr = getNextQueue();
        while (!oPtr.isEmpty()) {
            qPtr.add(oPtr.remove());
        }
    }

    private Queue<Integer> getNextQueue() {
        if (qPtr == q1) {
            return q2;
        } else {
            return q1;
        }
    }

    public int pop() {
        return qPtr.poll();
    }

    public int top() {
        return qPtr.peek();
    }

    public boolean empty() {
        return qPtr.isEmpty();
    }
}
