package com.leetcode.algo.queue.stack_impl_2q;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStackTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "MyStackTests.json";

    public MyStackTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        String[] commands = testCase.input.commands;
        Integer[] values = testCase.input.values;
        String[] expected = testCase.output.expected;
        var stack = new MyStack();
        for (int i = 0; i < commands.length; ++i) {
            var result = executeCommand(stack, commands[i], values[i]);
            assertEquals(expected[i], result);
        }
    }

    private String executeCommand(MyStack stack, String command, Integer value) {
        switch (command) {
            case "push":
                stack.push(value);
                return "null";
            case "top":
                return Integer.toString(stack.top());
            case "pop":
                return Integer.toString(stack.pop());
            case "empty":
                return Boolean.toString(stack.empty());
            default:
                throw new IllegalArgumentException(String.format("Command %s not supported", command));
        }
    }
}