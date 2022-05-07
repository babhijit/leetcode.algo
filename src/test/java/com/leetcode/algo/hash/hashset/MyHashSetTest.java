package com.leetcode.algo.hash.hashset;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyHashSetTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "MyHashSetTests.json";

    public MyHashSetTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var solution = new MyHashSet();
        for (int i = 0; i < testCase.output.expected.length; ++i) {
            if (testCase.output.expected[i] == null) {
                String op = testCase.input.ops[i];
                if (op.equals("add")) {
                    solution.add(testCase.input.values[i]);
                } else if (op.equals("remove")) {
                    solution.remove(testCase.input.values[i]);
                }
            } else {
                if (testCase.output.expected[i] != solution.contains(testCase.input.values[i])) {
                    solution.contains(testCase.input.values[i]);
                    System.out.println("failed for testCase.input.values[i]: " + testCase.output.expected[i]);
                }
                assertEquals(testCase.output.expected[i], solution.contains(testCase.input.values[i]));
            }
        }
    }
}