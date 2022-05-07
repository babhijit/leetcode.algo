package com.leetcode.algo.linkedlist.iterator.peeking_iterator;

import com.leetcode.algo.AbstractExecuteTests;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeekingIteratorTest extends AbstractExecuteTests<TestCase> {
    private static final String FILE_NAME = "PeekingIteratorTests.json";

    public PeekingIteratorTest() {
        super(FILE_NAME, TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        var inputIterator = createInputIterator(testCase.input.init);
        var solution = new PeekingIterator(inputIterator);

        final int N = testCase.input.ops.length;
        for (int i = 0; i < N; ++i) {
            switch (testCase.input.ops[i]) {
                case "next":
                    assertEquals(testCase.output.expected[i], solution.next().toString());
                    break;
                case "peek":
                    assertEquals(testCase.output.expected[i], solution.peek().toString());
                    break;
                case "hasNext":
                    assertEquals(Boolean.parseBoolean(testCase.output.expected[i]), solution.hasNext());
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    private Iterator<Integer> createInputIterator(Integer[] values) {
        var list = List.of(values);
        return list.iterator();

    }
}