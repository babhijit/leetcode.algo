package com.leetcode.algo.linkedlist.flatten_nested_list_itr_341;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedIteratorTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "NestedIteratorTests.json";

    public NestedIteratorTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        List<NestedInteger> list = createNestedInteger(testCase.nestedList);
        var solution = new NestedIterator(list);

        List<Integer> actual = new ArrayList<>();
        while (solution.hasNext()) {
            actual.add(solution.next());
        }
        List<Integer> expected = new ArrayList<>();
        for (var num: testCase.output) {
            expected.add(num);
        }
        assertEquals(expected, actual);
    }

    private List<NestedInteger> createNestedInteger(String nestedListInput) {
        Stack<IntOrListOfInts> stack = new Stack<>();
        String[] inputs = nestedListInput.split("[\\s,]+");
        IntOrListOfInts current = null;
        for (var input: inputs) {
            input = input.strip();
            switch (input) {
                case "[" -> {
                    current = new IntOrListOfInts();
                    stack.push(current);
                }
                case "]" -> {
                    var latest = stack.pop();
                    if (!stack.isEmpty()) {
                        current = stack.peek();
                        current.add(latest);
                    } else {
                        current = latest;
                    }
                }
                default -> {
                    var value = Integer.parseInt(input);
                    Objects.requireNonNull(current).add(value);
                }
            }
        }
        return Objects.requireNonNull(current).getList();
    }
}